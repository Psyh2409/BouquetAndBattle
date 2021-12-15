package com.psyh2409.flowers;

public class Lilac extends Flower {
    private String color;
    private double price;

    public Lilac(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lilac{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
