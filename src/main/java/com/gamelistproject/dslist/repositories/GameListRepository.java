package com.gamelistproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamelistproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
