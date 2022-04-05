package org.humanbooster.bank.model.vehicule;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Vehicule> vehiculeList = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public int countByBrand(String brand){
        return (int) this.vehiculeList.stream()
                .filter(vehicule -> vehicule.brand.equalsIgnoreCase(brand))
                .count();
    }

    public void add(Vehicule v){
        this.vehiculeList.add(v);
    }

    public void startAllVehicules(){
        for (Vehicule vehicule : this.vehiculeList) {
            vehicule.start();
            if (vehicule instanceof Boat){
                ((Boat) vehicule).sail();
            }else if (vehicule instanceof Plane p){
                p.fly();
            }

        }
    }
}
