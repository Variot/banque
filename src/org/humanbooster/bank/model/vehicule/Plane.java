package org.humanbooster.bank.model.vehicule;

public class Plane extends Vehicule{
    @Override
    public void Start() {
        System.out.println("L'avion' "+this.brand+" decolle");
    }

    @Override
    public void Stop() {
        System.out.println("L'avion "+this.brand+" atterit");
    }

    public Plane(String brand, int engine) {
        super(brand, engine);
    }
}
