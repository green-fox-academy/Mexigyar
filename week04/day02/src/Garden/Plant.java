package Garden;

public class Plant {
    private double waterAmount;
    private String color;
    private double waterAmountNeeded;

    public void waterPlant(double WateringAmount) {
        waterAmount += WateringAmount;
    }

    public Plant(String color) {
        this.waterAmount = 0;
        this.color = color;
        this.waterAmountNeeded = 5;
    }

    public Plant() {
        this.color = "Basic colored";
        this.waterAmount = 0;
        this.waterAmountNeeded = 5;
    }


    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWaterAmountNeeded(double waterAmountNeeded) {
        this.waterAmountNeeded = waterAmountNeeded;
    }

    public double getWaterAmountNeeded() {
        return waterAmountNeeded;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public String getColor() {
        return color;
    }

}
