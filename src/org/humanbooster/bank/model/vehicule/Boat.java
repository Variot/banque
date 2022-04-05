package org.humanbooster.bank.model.vehicule;

public class Boat extends Vehicule{

    public Boat(String brand, int engine) {
        super(brand, engine);
    }

    @Override
    public void start() {
        System.out.println("Le bateau "+this.brand+" leve l'ancre");
    }

    @Override
    public void stop() {
        System.out.println("Le bateau "+this.brand+" jette son ancre");
    }

    public void sail(){
        System.out.println("Le bateau vogue");
    }
}
