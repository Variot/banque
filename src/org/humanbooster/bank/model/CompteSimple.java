package org.humanbooster.bank.model;

public class CompteSimple extends Compte{
    private float decouvert;

    public CompteSimple(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant){
        if (montant < (this.solde+ this.decouvert))
            this.solde -= montant;
    }
}
