package com.psyh2409.soldiers.weapons;

public abstract class Weapon {
    protected int distance;
    private double damage;

    public Weapon(int distance, double damage) {
        this.distance = distance;
        this.damage = damage;
    }

    public int getDistance() {
        return distance;
    }
    public double getDamage() {
        return damage;
    }
}
