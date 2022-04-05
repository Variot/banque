package org.humanbooster.bank.model.rpg;

public class Berserker extends Humanoid{
    private int rage;

    public Berserker(String name, double health, int force) {
        super(name, health, force);
        this.rage = 0;
    }

    public void addRage(int rage){
        this.rage += rage;
        System.out.println("    "+this.name+" gained "+rage+" rage ("+this.rage+" total rage)");
    }

    @Override
    public void receiveDamage(double damage) {
        super.receiveDamage(damage);
        addRage(3);
    }

    public void useRage(Humanoid h){
        if (this.rage >=8 ){
            System.out.println("\n"+this.name+" unleash his inner rage");
            h.receiveDamage(this.force*1.5);
            this.rage -= 8;
            System.out.println("    "+this.name+" lost 8 rage ("+this.rage+" total rage)");
        } else
            System.out.println("\n"+this.name+" failed to use rage (not enough rage)");
    }

}
