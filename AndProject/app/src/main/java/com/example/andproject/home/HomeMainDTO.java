package com.example.andproject.home;

public class HomeMainDTO {
    private int imgHomeMain, imgHomesub1, imgHomesub2, imgHomesub3;
    private String imgHomeTitle;

    public HomeMainDTO(int imgHomeMain, int imgHomesub1, int imgHomesub2, int imgHomesub3, String imgHomeTitle) {
        this.imgHomeMain = imgHomeMain;
        this.imgHomesub1 = imgHomesub1;
        this.imgHomesub2 = imgHomesub2;
        this.imgHomesub3 = imgHomesub3;
        this.imgHomeTitle = imgHomeTitle;
    }

    public int getImgHomeMain() {
        return imgHomeMain;
    }

    public void setImgHomeMain(int imgHomeMain) {
        this.imgHomeMain = imgHomeMain;
    }

    public int getImgHomesub1() {
        return imgHomesub1;
    }

    public void setImgHomesub1(int imgHomesub1) {
        this.imgHomesub1 = imgHomesub1;
    }

    public int getImgHomesub2() {
        return imgHomesub2;
    }

    public void setImgHomesub2(int imgHomesub2) {
        this.imgHomesub2 = imgHomesub2;
    }

    public int getImgHomesub3() {
        return imgHomesub3;
    }

    public void setImgHomesub3(int imgHomesub3) {
        this.imgHomesub3 = imgHomesub3;
    }

    public String getImgHomeTitle() {
        return imgHomeTitle;
    }

    public void setImgHomeTitle(String imgHomeTitle) {
        this.imgHomeTitle = imgHomeTitle;
    }
}
