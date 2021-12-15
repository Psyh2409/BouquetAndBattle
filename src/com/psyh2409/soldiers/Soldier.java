package com.psyh2409.soldiers;

public abstract class Soldier {
    private double health;
    private boolean shield;

    protected Soldier(boolean shield) {
        this.health = 100;
        this.shield = shield;
    }

    public abstract void beat(Soldier victim);

    public boolean hasShield() {
        return shield;
    }

    public double getHealth() {
        return health;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    protected void changeHealth(double num){
        health += num;
    }

    public boolean isAlive() {
        return health>0;
    }

}
