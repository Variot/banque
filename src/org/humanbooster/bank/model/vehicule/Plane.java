package org.humanbooster.bank.model.vehicule;

public class Plane extends Vehicule{
    @Override
    public void start() {
        System.out.println("L'avion' "+this.brand+" decolle");
    }

    @Override
    public void stop() {
        System.out.println("L'avion "+this.brand+" atterit");
    }

    public Plane(String brand, int engine) {
        super(brand, engine);
    }

    public void fly(){
        System.out.println("L'avion vole");
    }
}
