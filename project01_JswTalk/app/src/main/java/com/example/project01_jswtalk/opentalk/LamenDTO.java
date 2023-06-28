package com.example.project01_jswtalk.opentalk;

public class LamenDTO {
    int imgRes;
    String title, people;

    public LamenDTO(int imgRes, String title, String people) {
        this.imgRes = imgRes;
        this.title = title;
        this.people = people;
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

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
}
