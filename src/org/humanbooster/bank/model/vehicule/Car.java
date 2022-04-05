package org.humanbooster.bank.model.vehicule;

public class Car extends Vehicule{
    public Car(String brand, int engine) {
        super(brand, engine);
    }

    @Override
    public void Start() {
        System.out.println("La voiture "+this.brand+" prend la route");
    }

    @Override
    public void Stop() {
        System.out.println("La voiture "+this.brand+" s'arrete sur le bas cote");
    }
}
