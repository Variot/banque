package org.humanbooster.bank.model.rpg;

public class Berserker extends Humanoid{
    private int rage;

    public Berserker(String name, double health, int force, int rage) {
        super(name, health, force);
        this.rage = rage;
    }

    public void addRage(int rage){
        this.rage += rage;
    }

    @Override
    public void receiveDamage(double damage) {
        super.receiveDamage(damage);
        addRage(3);
    }

    public void useRage(Humanoid h){
        if (this.rage >=8 ){
            h.receiveDamage(this.force*1.5);
            this.rage -= 8;
        }
    }

}
