package Garden;

import java.util.ArrayList;
import java.util.List;



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

        wateringAmount = wateringAmount / this.garden.size();
        for (int i = 0; i < this.garden.size(); i++) {
            if (hasEnoughWater(this.garden.get(i)));

        }
    }

    public Boolean hasEnoughWater(Plant plant){
        if (plant.getWaterAmountNeeded() < plant.getWaterAmount()){
            return true;
        } else
            return false;
    }
}
