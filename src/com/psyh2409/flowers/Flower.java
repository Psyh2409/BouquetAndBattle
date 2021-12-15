package com.psyh2409.flowers;

public abstract class Flower {
    private String color;
    private double price;

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public abstract String toString();
}
