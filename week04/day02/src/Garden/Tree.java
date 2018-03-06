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

    @Override
    public void info() {
        if (getWaterAmountNeeded() < getWaterAmount()){
            System.out.println("The " + getColor() + " Tree doesnt need water");
        } else
            System.out.println("The " + getColor() + " Tree needs water");
    }

}
