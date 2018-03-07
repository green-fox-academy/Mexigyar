package AircraftCarrier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AircraftCarrier {
    private ArrayList<Aircraft> aircraftCarrier;
    private int ammo;
    private int health;

    public AircraftCarrier(int ammo, int health) {
        this.aircraftCarrier = new ArrayList<>();
        this.ammo = 99999999;
        //untill i solve the exception problen att fill() Method
        this.health = health;
    }

    public void addAircraft(String string) {
        if (string == "F16" || string == "f16") {
            F16 f16Aircraft = new F16();
            this.aircraftCarrier.add(f16Aircraft);
        }
        if (string == "F35" || string == "f35") {
            F35 f35Aircraft = new F35();
            this.aircraftCarrier.add(f35Aircraft);
        }
    }

    public void fill() {


        if (totalAmmoNeeded() > ammo) {
            for (int j = 0; j < aircraftCarrier.size(); j++) {
                if (aircraftCarrier.get(j).getType() == "F35") {
                    aircraftCarrier.get(j).refill(ammo);
                }
            }
        }
        for (int i = 0; i < aircraftCarrier.size(); i++) {
            ammo = aircraftCarrier.get(i).refill(ammo);
        }
    }

    public int totalAmmoNeeded() {
        int totalAmmoNeeded = 0;
        for (int i = 0; i < aircraftCarrier.size(); i++) {
            totalAmmoNeeded += aircraftCarrier.get(i).getMaxAmmo() + aircraftCarrier.get(i).getAmmo();
        }
        return totalAmmoNeeded;
    }
    public void fight(AircraftCarrier aircraftCarrier){
        //need to be done
    }
    public void getStatus(){
        //need to be done
    }
}


