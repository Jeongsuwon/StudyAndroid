package com.example.andproject.around;

public class GenreRecvDTO {
    private int genreRes1, getGenreRes2;

    public GenreRecvDTO(int genreRes1, int getGenreRes2) {
        this.genreRes1 = genreRes1;
        this.getGenreRes2 = getGenreRes2;
    }

    public int getGenreRes1() {
        return genreRes1;
    }

    public void setGenreRes1(int genreRes1) {
        this.genreRes1 = genreRes1;
    }

    public int getGetGenreRes2() {
        return getGenreRes2;
    }

    public void setGetGenreRes2(int getGenreRes2) {
        this.getGenreRes2 = getGenreRes2;
    }
}
