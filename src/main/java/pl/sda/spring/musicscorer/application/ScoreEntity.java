package pl.sda.spring.musicscorer.application;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class ScoreEntity {

    @Id
    @GeneratedValue
    private UUID id;
    String user;
    int score;
    int albumId;
}
