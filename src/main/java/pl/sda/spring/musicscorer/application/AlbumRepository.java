package pl.sda.spring.musicscorer.application;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlbumRepository extends JpaRepository<AlbumEntity, UUID> {

}
