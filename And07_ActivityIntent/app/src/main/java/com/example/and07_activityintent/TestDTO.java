package com.example.and07_activityintent;

import java.io.Serializable;

public class TestDTO implements Serializable {
    String edt_str;
    int edt_int;

    public void setEdt_str(String edt_str) {
        this.edt_str = edt_str;
    }

    public void setEdt_int(int edt_int) {
        this.edt_int = edt_int;
    }

    public String getEdt_str() {
        return edt_str;
    }

    public int getEdt_int() {
        return edt_int;
    }

    public TestDTO(String edt_str, int edt_int) {
        this.edt_str = edt_str;
        this.edt_int = edt_int;
    }
}
