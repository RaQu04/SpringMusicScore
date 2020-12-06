package pl.sda.spring.musicscorer.application.album;

import org.springframework.stereotype.Service;
import pl.sda.spring.musicscorer.application.score.ScoreService;
import pl.sda.spring.musicscorer.domain.Album;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;
    private final ScoreService scoreService;

    public AlbumService(AlbumRepository albumRepository, ScoreService scoreService) {
        this.albumRepository = albumRepository;
        this.scoreService = scoreService;
    }

    public Optional<Album> getAlbum(String id) {
        BigDecimal albumScore = scoreService.getAlbumScore(id);
        return albumRepository.findById(UUID.fromString(id))
                .map(albumEntity -> new Album(albumEntity.getArtist(), albumEntity.getTitle(), albumScore));
    }
}

