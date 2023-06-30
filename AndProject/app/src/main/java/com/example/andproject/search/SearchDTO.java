package com.example.andproject.search;

public class SearchDTO {
    private int rank;
    private String title;

    public SearchDTO(int rank, String title) {
        this.rank = rank;
        this.title = title;
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
}
