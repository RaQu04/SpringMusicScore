package pl.sda.spring.musicscorer.application;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.sda.spring.musicscorer.domain.Album;

@Service
public class AlbumService {
    public Album getAlbum(String id) {
        return null;
    }

    public ResponseEntity<AlbumsResponse> getAlbums(String title, String artist) {
        return null;
    }
}
