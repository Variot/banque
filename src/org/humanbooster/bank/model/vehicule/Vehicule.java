package org.humanbooster.bank.model.vehicule;

public abstract class Vehicule {
    private int engine;
    protected String brand;

    public Vehicule(String brand, int engine){
        this.brand = brand;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();

    public final void  DisplayEngine(){
        System.out.println("Le vehicule "+this.brand+" a une puissance de "+this.engine);
    }
}
