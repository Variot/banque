package org.humanbooster.bank;

import org.humanbooster.bank.model.CompteEpargne;
import org.humanbooster.bank.model.ComptePayant;
import org.humanbooster.bank.model.CompteSimple;

public class MainEntry {
    public static void main(String[] args) {
        System.out.println("    Compte Simple");
        CompteSimple cs = new CompteSimple(100);
        cs.verser(200);
        System.out.println(cs);
        cs.retirer(250);
        System.out.println(cs);
        cs.retirer(250);
        System.out.println(cs);

        System.out.println("    Compte Epargne");
        CompteEpargne ce = new CompteEpargne(0.75f);
        ce.verser(200);
        System.out.println(ce);
        ce.retirer(250);
        System.out.println(ce);
        ce.retirer(50);
        System.out.println(ce);
        ce.calculInterets();
        System.out.println("Calculs des intérets");
        System.out.println(ce);

        System.out.println("    Compte Payant");
        ComptePayant cp = new ComptePayant();
        cp.verser(200);
        System.out.println(cp);
        cp.retirer(250);
        System.out.println(cp);
        cp.retirer(20);
        System.out.println(cp);
    }
}
