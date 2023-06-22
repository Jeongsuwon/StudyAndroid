package com.example.and09_fragmentadapter.practice;

public class MelonDTO {
    int imgRes, rank;
    String title, singer;

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
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

    public MelonDTO(int imgRes, int rank, String title, String singer) {
        this.imgRes = imgRes;
        this.rank = rank;
        this.title = title;
        this.singer = singer;
    }
}
