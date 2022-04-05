package org.humanbooster.bank.model.rpg;

public abstract class Humanoid {
    protected String name;
    protected double health;
    protected int force;

    public Humanoid(String name, double health, int force) {
        this.name = name;
        this.health = health;
        this.force = force;
    }

    public void attack(Humanoid h){
        System.out.println("\n"+this.name+" has attacked "+h.name);
        h.receiveDamage(this.force);
    }

    public void receiveDamage(double damage) {
        this.health -= damage;
        System.out.println("    "+this.name+" lost "+damage+"HP ("+this.health+"HP left)");
    }
    public String toString(){
        return this.name+" a "+this.health+"HP";
    }
}
