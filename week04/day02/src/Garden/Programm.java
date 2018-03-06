package Garden;

public class Programm {

    public static void main(String[] args) {
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1= new Tree("purple");
        Tree tree2= new Tree("orange");

        Garden myGarden = new Garden();

        myGarden.addFlower(flower1);
        myGarden.addFlower(flower2);
        myGarden.addTree(tree1);
        myGarden.addTree(tree2);

        myGarden.info();
        System.out.println("");
        myGarden.waterGarden(40);
        System.out.println("");
        myGarden.waterGarden(70);
    }

}
