package org.humanbooster.bank.model.rpg;

public class Warrior extends Humanoid{
    private boolean doubleAttackReady = true;

    public Warrior(String name, double health, int force) {
        super(name, health, force);
    }

    public void doubleAttack(Humanoid h){
        System.out.println("\n"+this.name+" launch double attack on "+h.name);
        h.receiveDamage(this.force*0.7);
        h.receiveDamage(this.force*0.7);
        this.doubleAttackReady=false;
    }

    @Override
    public void attack(Humanoid h){
        super.attack(h);
        this.doubleAttackReady = true;
    }

}
