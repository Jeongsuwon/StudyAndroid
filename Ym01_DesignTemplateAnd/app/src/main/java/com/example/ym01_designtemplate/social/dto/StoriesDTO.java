package com.example.ym01_designtemplate.social.dto;

public class StoriesDTO {

    String imageUrl;
    String name;

    public StoriesDTO(String imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }
}
