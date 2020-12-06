package pl.sda.spring.musicscorer.application;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface ScoreRepository extends JpaRepository<ScoreEntity, UUID> {
}
