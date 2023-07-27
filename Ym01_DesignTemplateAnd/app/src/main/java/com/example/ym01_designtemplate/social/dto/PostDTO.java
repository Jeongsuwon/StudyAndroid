package com.example.ym01_designtemplate.social.dto;

public class PostDTO {

    String tilte;
    int image;
    String id;
    int type;



    public PostDTO(String tilte, int image, String id, int type) {
        this.tilte = tilte;
        this.image = image;
        this.id = id;
        this.type = type;
    }

    public String getTilte() {
        return tilte;
    }

    public int getImage() {
        return image;
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }
}
