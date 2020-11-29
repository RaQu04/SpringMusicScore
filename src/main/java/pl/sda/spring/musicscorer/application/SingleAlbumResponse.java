package pl.sda.spring.musicscorer.application;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class SingleAlbumResponse {
    String artist;
    String title;
    BigDecimal rate;

}
