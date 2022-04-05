package org.humanbooster.bank.model.vehicule;

public class Car extends Vehicule{
    public Car(String brand, int engine) {
        super(brand, engine);
    }

    @Override
    public void start() {
        System.out.println("La voiture "+this.brand+" prend la route");
    }

    @Override
    public void stop() {
        System.out.println("La voiture "+this.brand+" s'arrete sur le bas cote");
    }
}
