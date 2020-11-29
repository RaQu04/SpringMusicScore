package pl.sda.spring.musicscorer.application;

import lombok.Value;
import java.util.List;

@Value
public class AlbumsResponse {
    List<SingleAlbumResponse> albums;

}
