package com.example.andproject.around;

public class NextMovieDTO {
    private int movie_info_img;
    private String movie_info_title, movie_info_singer;

    public NextMovieDTO(int movie_info_img, String movie_info_title, String movie_info_singer) {
        this.movie_info_img = movie_info_img;
        this.movie_info_title = movie_info_title;
        this.movie_info_singer = movie_info_singer;
    }

    public int getMovie_info_img() {
        return movie_info_img;
    }

    public void setMovie_info_img(int movie_info_img) {
        this.movie_info_img = movie_info_img;
    }

    public String getMovie_info_title() {
        return movie_info_title;
    }

    public void setMovie_info_title(String movie_info_title) {
        this.movie_info_title = movie_info_title;
    }

    public String getMovie_info_singer() {
        return movie_info_singer;
    }

    public void setMovie_info_singer(String movie_info_singer) {
        this.movie_info_singer = movie_info_singer;
    }
}
