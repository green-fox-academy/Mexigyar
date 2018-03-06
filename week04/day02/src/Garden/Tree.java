package Garden;

public class Tree extends Plant {
    @Override
    public void waterPlant(double WateringAmount) {
        super.waterPlant(0.4 * WateringAmount);
    }

    public Tree(String color) {
        super(color);
        setWaterAmountNeeded(10);
    }

    public Tree() {
        setWaterAmountNeeded(10);
    }

}
