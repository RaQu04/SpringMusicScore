package pl.sda.spring.musicscorer.application;

import lombok.Value;

import java.time.LocalDate;

@Value
public class AddAlbumRequest {
    String artist;
    String title;
    LocalDate releaseDate;
    String description;
}
