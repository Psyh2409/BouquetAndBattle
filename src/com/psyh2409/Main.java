package com.psyh2409;

import com.psyh2409.flowers.*;
import com.psyh2409.soldiers.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        System.out.println(
                "The bouquet worth: " +
                Arrays.stream(new Flower[]{
                        new Rose("red", 5.5),
                        new Tulip("yellow", 4.7),
                        new Lilac("violet", 3)
                })
                        .map(Flower::getPrice)
                        .reduce((double) 0, Double::sum)
        );
        battle(
                new Spearman(false),
                new Swordman(true),
                new Knifeman(true)
        );
    }

    private static void battle(Soldier... men) {
        while (Arrays.stream(men)
                     .filter(Soldier::isAlive)
                     .count()>1){
            int a = random.nextInt(0,men.length);
            int b = random.nextInt(0,men.length);
            if (a!=b && men[a].isAlive() && men[b].isAlive()) {
                men[a].beat(men[b]);
            }
        }
        for (Soldier s: men) {
            if (s.isAlive())
                System.out.println("Wins " + s.getClass().getSimpleName() + "!");
        }
    }
}
