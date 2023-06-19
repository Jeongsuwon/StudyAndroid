package com.example.testsdk;

import java.io.Serializable;

public class DrinkDTO implements Serializable {
    private String drink;
    private int count, price;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDrink() {
        return drink;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public DrinkDTO(String drink, int count, int price) {
        this.drink = drink;
        this.count = count;
        this.price = price;
    }
}
