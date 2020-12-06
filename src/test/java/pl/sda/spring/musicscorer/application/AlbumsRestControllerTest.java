package pl.sda.spring.musicscorer.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pl.sda.spring.musicscorer.application.album.AlbumEntity;
import pl.sda.spring.musicscorer.application.album.AlbumRepository;
import pl.sda.spring.musicscorer.application.album.AlbumsResponse;
import pl.sda.spring.musicscorer.application.album.SingleAlbumResponse;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AlbumsRestControllerTest {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void should_get_album() {
        //given
        final AlbumEntity albumEntity
                = new AlbumEntity(null, "ten", "pearl jam", "some desc", LocalDate.of(1990, 2, 10));
        final AlbumEntity savedAlbum = albumRepository.save(albumEntity);

        //when
        final ResponseEntity<SingleAlbumResponse> albumResponse
                = testRestTemplate.getForEntity("/albums/" + savedAlbum.getId().toString(), SingleAlbumResponse.class);

        //then
        Assertions.assertThat(albumResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        Assertions.assertThat(albumResponse.getBody()).isNotNull();
        Assertions.assertThat(albumResponse.getBody().getArtist()).isEqualTo("pearl jam");
        Assertions.assertThat(albumResponse.getBody().getTitle()).isEqualTo("ten");
    }

    @Test
    void should_get_albums_by_title_and_artist() {
        //given
        final AlbumEntity albumEntity1
                = new AlbumEntity(null, "ten", "pearl jam", "some desc", LocalDate.of(1990, 2, 10));
        final AlbumEntity albumEntity2
                = new AlbumEntity(null, "awake", "godsmack", "some desc", LocalDate.of(1990, 2, 10));
        albumRepository.saveAll(List.of(albumEntity1, albumEntity2));
        //when
        final ResponseEntity<AlbumsResponse> albumsResponse = testRestTemplate
                .getForEntity("/albums?title=awake&artist=godsmack", AlbumsResponse.class);
        //then
        Assertions.assertThat(albumsResponse.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
        Assertions.assertThat(albumsResponse.getBody()).isNotNull();
        Assertions.assertThat(albumsResponse.getBody().getAlbums()).hasSize(1);

    }
}