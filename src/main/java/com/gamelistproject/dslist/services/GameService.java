package com.gamelistproject.dslist.services;

import com.gamelistproject.dslist.dto.GameDTO;
import com.gamelistproject.dslist.dto.GameMinDTO;
import com.gamelistproject.dslist.entities.Game;
import com.gamelistproject.dslist.projections.GameMinProjection;
import com.gamelistproject.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService  {
	
    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
    	Game result = gameRepository.findById(id).get();
    	GameDTO dto = new GameDTO(result);
    	return dto;
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game>result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(game -> new GameMinDTO(game)).collect(Collectors.toList());
        return dto;
                
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
    	List<GameMinProjection> result = gameRepository.searchByList(listId);
    	return result.stream().map(x -> new GameMinDTO(x)).toList();
      
                
    }
}
