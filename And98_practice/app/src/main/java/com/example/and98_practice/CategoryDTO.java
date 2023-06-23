package com.example.and98_practice;

public class CategoryDTO {
    private int imgRes;
    private  String title;

    public CategoryDTO(int imgRes, String title) {
        this.imgRes = imgRes;
        this.title = title;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
