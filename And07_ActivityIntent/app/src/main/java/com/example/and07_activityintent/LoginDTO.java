package com.example.and07_activityintent;


import java.io.Serializable;

//alt+insert
public class LoginDTO implements Serializable {
    private String id, pw;

    public LoginDTO(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
