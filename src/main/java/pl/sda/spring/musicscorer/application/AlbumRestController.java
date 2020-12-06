package pl.sda.spring.musicscorer.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.spring.musicscorer.domain.Album;

@RestController
public class AlbumRestController {

    private final AlbumService albumService;

    public AlbumRestController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public ResponseEntity<AlbumsResponse> getAlbums(@RequestParam(required = false) String artist,
                                                    @RequestParam(required = false) String title){
       return albumService.getAlbums(title, artist);
    }

    @GetMapping("/albums/{id}")
    public ResponseEntity<SingleAlbumResponse> getAlbum(@PathVariable String id){
        final Album album = albumService.getAlbum(id);
        return ResponseEntity.ok(SingleAlbumResponse.fromAlbum(album));
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
