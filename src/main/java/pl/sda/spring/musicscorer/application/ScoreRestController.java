package pl.sda.spring.musicscorer.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreRestController {

    @PostMapping("/scores")
    public ResponseEntity<Void> scoreAlbum(@RequestBody ScoreRequest scoreRequest){
        System.out.println(scoreRequest);
        return null;
    }
}
