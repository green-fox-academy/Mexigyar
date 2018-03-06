package Garden;

import java.util.ArrayList;
import Garden.Plant;




public class Garden {
    private ArrayList <Plant> garden;

    public Garden() {
        this.garden  = new ArrayList ();
    }
    public void addFlower(Flower flower){
        garden.add(flower);
    }
    public void addTree(Tree tree){
        garden.add(tree);
    }
    public void waterGarden(double wateringAmount){
        System.out.println("Watering with " + wateringAmount);
        int plantsToWater = 0;
        for (int i = 0; i < this.garden.size(); i++) {
            if (!hasEnoughWater(this.garden.get(i))){
                plantsToWater++;
            }
        }
        wateringAmount = wateringAmount / plantsToWater;
        for (int i = 0; i < this.garden.size(); i++) {
            if (!hasEnoughWater(this.garden.get(i))){
                this.garden.get(i).waterPlant(wateringAmount);
            }
        }
        for (int i = 0; i < this.garden.size(); i++) {
            this.garden.get(i).info();
        }
    }

    public Boolean hasEnoughWater(Plant plant){
        if (plant.getWaterAmountNeeded() < plant.getWaterAmount()){
            return true;
        } else
            return false;
    }

    public void info(){
        for (int i = 0; i < this.garden.size(); i++) {
            this.garden.get(i).info();
        }
    }
}
