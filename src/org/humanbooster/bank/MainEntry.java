package org.humanbooster.bank;

import org.humanbooster.bank.model.CompteEpargne;
import org.humanbooster.bank.model.ComptePayant;
import org.humanbooster.bank.model.CompteSimple;
import org.humanbooster.bank.model.rpg.Berserker;
import org.humanbooster.bank.model.rpg.Warrior;
import org.humanbooster.bank.model.rpg.Wizard;
import org.humanbooster.bank.model.vehicule.Boat;
import org.humanbooster.bank.model.vehicule.Car;
import org.humanbooster.bank.model.vehicule.Plane;

public class MainEntry {
    public static void main(String[] args) {
        testVehicule();
        //testBank();
        //testRpg();
    }

    public static void testBank(){
        System.out.println("    Compte Simple");
        CompteSimple cs = new CompteSimple(100,0);
        cs.verser(200);
        System.out.println(cs);
        cs.retirer(250);
        System.out.println(cs);
        cs.retirer(250);
        System.out.println(cs);

        System.out.println("    Compte Epargne");
        CompteEpargne ce = new CompteEpargne(0.75f,0);
        ce.verser(200);
        System.out.println(ce);
        ce.retirer(250);
        System.out.println(ce);
        ce.retirer(50);
        System.out.println(ce);
        ce.calculInterets();
        System.out.println("Calculs des interets");
        System.out.println(ce);

        System.out.println("    Compte Payant");
        ComptePayant cp = new ComptePayant(0);
        cp.verser(200);
        System.out.println(cp);
        cp.retirer(250);
        System.out.println(cp);
        cp.retirer(20);
        System.out.println(cp);
    }
    public static void testRpg(){
        Wizard gandalf = new Wizard("Gandalf le gris",200,10,30,50);
        Berserker kratos = new Berserker("Kratos",500,200);
        Warrior castex = new Warrior("Jean Castex",250,10);
        gandalf.attack(castex);
        gandalf.activateShield();
        castex.attack(gandalf);
        castex.doubleAttack(gandalf);
        kratos.useRage(castex);
        kratos.addRage(20);
        kratos.useRage(castex);
        gandalf.spellCast(kratos);
    }
    public static void testVehicule(){
        Boat boat1 = new Boat("Zodiac",580);
        Car car1 = new Car("Ferrari",650);
        Plane plane1 = new Plane("Airbus",3000);

        boat1.Start();
        boat1.Stop();
        boat1.DisplayEngine();

        car1.Start();
        car1.Stop();
        car1.DisplayEngine();

        plane1.Start();
        plane1.Stop();
        plane1.DisplayEngine();
    }
}
