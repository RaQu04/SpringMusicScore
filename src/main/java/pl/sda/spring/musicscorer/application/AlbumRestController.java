package pl.sda.spring.musicscorer.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlbumRestController {

    @GetMapping("/albums")
    public ResponseEntity<AlbumsResponse> getAlbums(@RequestParam(required = false) String artist,
                                                    @RequestParam(required = false) String title){
       return null;
    }

    @GetMapping("/albums/{id}")
    public ResponseEntity<SingleAlbumResponse> getAlbum(@PathVariable String id){
        return null;
    }

    @PostMapping("/albums")
    public ResponseEntity<Void> addAlbum(@RequestBody AddAlbumRequest addAlbumRequest){
        System.out.println(addAlbumRequest);
        return null;
    }

    @PutMapping("/albums/{id}")
    public ResponseEntity<Void> editAlbum(@RequestBody AddAlbumRequest addAlbumRequest, @PathVariable String id){
        return null;
    }

    @DeleteMapping("/albums/{id}")
    public ResponseEntity<Void> removeAlbum(@PathVariable String id){
        return null;
    }

}
