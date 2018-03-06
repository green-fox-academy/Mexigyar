package AircraftCarrier;

public class Aircraft {
    private int ammo;
    private int maxAmmo;
    private int baseDamage;
    private String type;

    public Aircraft() {
        this.ammo = 0;
        this.maxAmmo = 0;
        this.baseDamage = 0;
    }

    public int fight() {
        int shotsDealt = ammo;
        ammo = 0;
        return shotsDealt * baseDamage;
    }

    public int refill(int ammoGiven) {
        int ammoNeeded = Aircraft.this.maxAmmo - Aircraft.this.ammo;
        if (ammoNeeded == ammoGiven) {
            return ammoGiven;
        } else if(ammoGiven < ammoNeeded){
            ammo += ammoNeeded;
            return 0;
        } else
            ammo += ammoNeeded;
            return ammoGiven - ammoNeeded;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public String getType() {
        return type;
    }
    public String getStatus(){
        return "Type" + getType() + ", Ammo: " + getAmmo() + ", Base Damage: " +
                getBaseDamage() + ", All Damage: " + getAmmo() * getBaseDamage();

    }
}

