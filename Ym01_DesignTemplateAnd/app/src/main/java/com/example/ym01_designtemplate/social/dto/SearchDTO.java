package com.example.ym01_designtemplate.social.dto;

public class SearchDTO {
    String name;
    String profileImage;

    public SearchDTO(String name, String profileImage) {
        this.name = name;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
