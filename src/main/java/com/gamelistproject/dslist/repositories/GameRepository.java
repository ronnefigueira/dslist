package com.gamelistproject.dslist.repositories;

import com.gamelistproject.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
