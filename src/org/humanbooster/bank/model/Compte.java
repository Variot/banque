package org.humanbooster.bank.model;

public abstract class Compte {

    private int id;
    protected float solde;
    private static int countComptes = 0;


    public Compte(float solde) {
        Compte.countComptes++;
        this.id = Compte.countComptes;
        this.solde = solde;
    }

    public void verser(float montant){
        this.solde += montant;
    }

    public void retirer(float montant){
        if (montant < this.solde)
            this.solde += montant;
    }

    public String toString(){
        return "Ce compte a un solde de : "+this.solde+" euros";
    }
}
