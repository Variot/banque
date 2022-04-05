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
            h.receiveDamage(this.force + this.intelligence);
            this.mana -= 10;
        }
    }

    public void activateShield(){
        if (this.mana >= 3) {
            this.shield = true;
            this.hitsOnShield = 5;
        }
    }

    @Override
    public void attack(Humanoid h){
        super.attack(h);
        this.mana++;
    }

    @Override
    public void receiveDamage(double damage){
        if (this.shield){
            super.receiveDamage(damage*0.8);
            this.hitsOnShield--;
            if (this.hitsOnShield == 0)
                this.shield = false;
        } else
            super.receiveDamage(damage);
    }


}
