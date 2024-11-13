package com.devsuperior.dslist.entities;

public class Game {
    private Long id;
    private String title;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
    
    public Game() {
        
    }

    public Game(Long id, String title, String genre, String platform, String imgUrl, String longDescription, String shortDescription) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
    }
    
}
