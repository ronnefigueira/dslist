package com.gamelistproject.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamelistproject.dslist.dto.GameListDTO;
import com.gamelistproject.dslist.dto.GameMinDTO;
import com.gamelistproject.dslist.entities.GameList;
import com.gamelistproject.dslist.repositories.GameListRepository;


@Service
public class GameListService  {
	
    @Autowired
    private GameListRepository gameListRepository;
    
   
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList>result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(game -> new GameListDTO(game)).collect(Collectors.toList());
        return dto;



    }
}
