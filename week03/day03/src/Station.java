public class Station {
    /*
    Petrol Station

Create Station and Car classes
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100
     */
    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car){
        car.gasAmount += 100 - car.capacity;
        car.capacity -= car.gasAmount;
    }
}
