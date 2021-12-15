package com.psyh2409.soldiers;

import com.psyh2409.soldiers.weapons.Spear;
import com.psyh2409.soldiers.weapons.Weapon;

public class Spearman extends Soldier{

    private Weapon weapon;

    public Spearman(boolean shield) {
        super(shield);
        this.weapon = new Spear();
    }

    @Override
    public void beat(Soldier victim) {
        if (super.isAlive()){
            System.out.println(
                    this.getClass().getSimpleName()
                    + " beats "
                    + victim.getClass().getSimpleName());
            victim.changeHealth((victim.hasShield() ? weapon.getDamage()/2 : weapon.getDamage())*-1);
            System.out.println(
                    victim.getClass().getSimpleName()
                    + (victim.isAlive() ? " is alive and has " + victim.getHealth() + " health." : " is dead."));
        }
    }
}
