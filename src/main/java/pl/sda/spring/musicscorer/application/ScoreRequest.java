package pl.sda.spring.musicscorer.application;

import lombok.Value;

@Value
public class ScoreRequest {
    String user;
    int score;
    int albumId;
}
