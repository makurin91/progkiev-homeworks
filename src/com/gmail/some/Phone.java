package com.gmail.some;

/*
Описать класс Phone. Реализуйте метод который будет возвращать стоимость и производителя телефона..
 */

public class Phone {
    private int price;
    private String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = 500;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = "iPhone";
    }
}
