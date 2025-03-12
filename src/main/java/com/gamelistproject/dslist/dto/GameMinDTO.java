package com.gamelistproject.dslist.dto;

import com.gamelistproject.dslist.entities.Game;
import com.gamelistproject.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer gameYear;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        gameYear = entity.getGameYear();
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
    }
    
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        gameYear = projection.getGameYear();
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
