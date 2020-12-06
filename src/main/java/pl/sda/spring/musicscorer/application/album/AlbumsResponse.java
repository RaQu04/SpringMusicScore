package pl.sda.spring.musicscorer.application.album;

import lombok.Value;

import java.util.List;

@Value
public class AlbumsResponse {
    List<SingleAlbumResponse> albums;

}
