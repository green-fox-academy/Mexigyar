public class FleetofThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
        Thing milk = new Thing("Get Milk");
        Thing removeObstacle = new Thing("Remove The Obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");
        fleet.add(milk);
        fleet.add(removeObstacle);
        fleet.add(standUp);
        standUp.complete();
        fleet.add(eatLunch);
        eatLunch.complete();
        System.out.println(fleet);
    }
}