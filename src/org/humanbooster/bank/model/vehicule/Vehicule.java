package org.humanbooster.bank.model.vehicule;

public abstract class Vehicule {
    private int engine;
    protected String brand;

    public Vehicule(String brand, int engine){
        this.brand = brand;
        this.engine = engine;
    }

    public abstract void Start();
    public abstract void Stop();

    public final void  DisplayEngine(){
        System.out.println("Le vehicule "+this.brand+" a une puissance de "+this.engine);
    }
}
