package com.example.project01_jswtalk.opentalk;

public class OpenChatDTO {
    int imgRes;
    String title, info;

    public OpenChatDTO(int imgRes, String title, String info) {
        this.imgRes = imgRes;
        this.title = title;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
