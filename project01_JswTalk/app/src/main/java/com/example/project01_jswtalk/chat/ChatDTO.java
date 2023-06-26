package com.example.project01_jswtalk.chat;

import java.util.Date;

public class ChatDTO {
    private int imgRes;
    private String name, msg, date;


    public ChatDTO(int imgRes, String name, String msg, String date) {
        this.imgRes = imgRes;
        this.name = name;
        this.msg = msg;
        this.date = date;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
