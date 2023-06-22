package com.example.and09_fragmentadapter.recyler;

public class RecvDTO {
    int age, imgRes;
    String gender, name, address;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public RecvDTO(String gender, String name, String address, int age, int imgRes) {
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.age = age;
        this.imgRes = imgRes;
    }

}
