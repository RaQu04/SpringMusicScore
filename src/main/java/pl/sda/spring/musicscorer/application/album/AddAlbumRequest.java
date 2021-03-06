package pl.sda.spring.musicscorer.application.album;

import lombok.Value;

import java.time.LocalDate;

@Value
public class AddAlbumRequest {
    String artist;
    String title;
    LocalDate releaseDate;
    String description;
}
