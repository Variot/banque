package org.humanbooster.bank.model.vehicule;

public class Boat extends Vehicule{

    public Boat(String brand, int engine) {
        super(brand, engine);
    }

    @Override
    public void Start() {
        System.out.println("Le bateau "+this.brand+" leve l'ancre");
    }

    @Override
    public void Stop() {
        System.out.println("Le bateau "+this.brand+" jette son ancre");
    }
}
