package com.example.project01_jswtalk.opentalk;

import java.io.Serializable;

public class OpenChatDetailDTO implements Serializable {
    int imgBack, imgProfile, imgLike, imgPaticipate;
    String hash, title, type, master, info;

    public OpenChatDetailDTO(int imgBack, int imgProfile, int imgLike, int imgPaticipate, String hash, String title, String type, String master, String info) {
        this.imgBack = imgBack;
        this.imgProfile = imgProfile;
        this.imgLike = imgLike;
        this.imgPaticipate = imgPaticipate;

        this.hash = hash;
        this.title = title;
        this.type = type;
        this.master = master;
        this.info = info;
    }

    public int getImgBack() {
        return imgBack;
    }

    public void setImgBack(int imgBack) {
        this.imgBack = imgBack;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public int getImgLike() {
        return imgLike;
    }

    public void setImgLike(int imgLike) {
        this.imgLike = imgLike;
    }

    public int getImgPaticipate() {
        return imgPaticipate;
    }

    public void setImgPaticipate(int imgPaticipate) {
        this.imgPaticipate = imgPaticipate;
    }


    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
