package org.humanbooster.bank.model;

public class CompteEpargne extends Compte {
    private float taux;

    public CompteEpargne(float taux) {
        this.taux = taux;
    }

    public void calculInterets(){
        this.solde += this.solde * this.taux/100;
    }
}
