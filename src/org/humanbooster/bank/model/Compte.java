package org.humanbooster.bank.model;

public abstract class Compte {

    private int id;
    protected float solde;
    private static int countComptes = 0;


    public Compte() {
        Compte.countComptes++;
        this.id = Compte.countComptes;
        this.solde = 0;
    }

    public void verser(float montant){
        this.solde += montant;
    }

    public void retirer(float montant){
        if (montant < this.solde)
            this.solde += montant;
    }
}
