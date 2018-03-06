package Garden;

public class Flower extends Plant {
    @Override
    public void waterPlant(double WateringAmount) {
        super.waterPlant(0.75 * WateringAmount);
    }

    public Flower(String color) {
        super(color);
        setWaterAmountNeeded(5);
    }

    public Flower() {
        setWaterAmountNeeded(5);
    }

}
