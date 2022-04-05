package org.humanbooster.bank.model;

public class ComptePayant extends Compte{

    public void verser(float montant){
        if (this.solde + montant - 1 > 0)
            this.solde += montant - 1;
    }

    public void retirer(float montant){
        if (montant+1 < this.solde)
            this.solde -= montant+1;
    }
}
