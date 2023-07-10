package com.example.andproject.home;

public class CompleteDTO {
    private String title, period;


    public CompleteDTO(String title, String period) {
        this.title = title;
        this.period = period;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
