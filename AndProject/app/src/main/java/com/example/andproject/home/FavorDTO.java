package com.example.andproject.home;

public class FavorDTO {
    private String favor_title, favor_singer, favor_genre;
    private int favor_img;

    public FavorDTO(String favor_title, String favor_singer, String favor_genre, int favor_img) {
        this.favor_title = favor_title;
        this.favor_singer = favor_singer;
        this.favor_genre = favor_genre;
        this.favor_img = favor_img;
    }

    public String getFavor_title() {
        return favor_title;
    }

    public void setFavor_title(String favor_title) {
        this.favor_title = favor_title;
    }

    public String getFavor_singer() {
        return favor_singer;
    }

    public void setFavor_singer(String favor_singer) {
        this.favor_singer = favor_singer;
    }

    public String getFavor_genre() {
        return favor_genre;
    }

    public void setFavor_genre(String favor_genre) {
        this.favor_genre = favor_genre;
    }

    public int getFavor_img() {
        return favor_img;
    }

    public void setFavor_img(int favor_img) {
        this.favor_img = favor_img;
    }
}
