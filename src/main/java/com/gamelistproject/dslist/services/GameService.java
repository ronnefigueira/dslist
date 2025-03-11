package com.gamelistproject.dslist.services;

import com.gamelistproject.dslist.dto.GameMinDTO;
import com.gamelistproject.dslist.entities.Game;
import com.gamelistproject.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService  {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game>result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(game -> new GameMinDTO(game)).collect(Collectors.toList());
        return dto;



    }
}
