package pl.sda.spring.musicscorer.domain;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Album {

    String artist;
    String title;
    BigDecimal score;
}
