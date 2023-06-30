package com.example.andproject.around;

public class FloChartDTO {
    private int imgFloChart, imgPlay, rank;
    private String title, singer;

    public FloChartDTO(int imgFloChart, int imgPlay, int rank, String title, String singer) {
        this.imgFloChart = imgFloChart;
        this.imgPlay = imgPlay;
        this.rank = rank;
        this.title = title;
        this.singer = singer;
    }

    public int getImgFloChart() {
        return imgFloChart;
    }

    public void setImgFloChart(int imgFloChart) {
        this.imgFloChart = imgFloChart;
    }

    public int getImgPlay() {
        return imgPlay;
    }

    public void setImgPlay(int imgPlay) {
        this.imgPlay = imgPlay;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
