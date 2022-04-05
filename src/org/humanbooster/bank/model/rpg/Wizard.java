package org.humanbooster.bank.model.rpg;

public class Wizard extends Humanoid{
    private int mana;
    private int intelligence;
    private boolean shield = false;
    private int hitsOnShield;

    public Wizard(String name, double health, int force, int mana, int intelligence) {
        super(name, health, force);
        this.mana = mana;
        this.intelligence = intelligence;
        this.hitsOnShield = 0;
    }

    public void spellCast(Humanoid h) {
        if (this.mana >= 10){
            System.out.println("\n"+this.name+" cast a spell on "+h.name);
            h.receiveDamage(this.force + this.intelligence);
            this.mana -= 10;
            System.out.println("    "+this.name+" consumed 10 mana ("+this.mana+" mana left)");
        }
    }

    public void activateShield(){
        if (this.mana >= 3) {
            this.shield = true;
            this.hitsOnShield = 5;
            System.out.println("\n"+this.name+" activate his shield");
        }
    }

    @Override
    public void attack(Humanoid h){
        super.attack(h);
        this.mana++;
        System.out.println("    "+this.name+" gained mana ("+this.mana+" mana total)");
    }

    @Override
    public void receiveDamage(double damage){
        if (this.shield){
            System.out.println("    "+this.name+"'s shield reduced incoming damage");
            super.receiveDamage(damage*0.8);
            this.hitsOnShield--;
            if (this.hitsOnShield == 0) {
                this.shield = false;
                System.out.println("    Shield faded");
            } else
                System.out.println("    "+this.hitsOnShield+" shield charge left");
        } else
            super.receiveDamage(damage);
    }


}
