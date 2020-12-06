package pl.sda.spring.musicscorer.application.album;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AlbumRepository extends JpaRepository<AlbumEntity, UUID> {

    List<AlbumEntity> findByTitleAndArtist(String title, String artist);
}
