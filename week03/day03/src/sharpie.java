public class Sharpie {
    /*
    Create Sharpie class
We should know about each Sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every Sharpie is created with a default 100 as inkAmount
We can use() the Sharpie objects
which decreases inkAmount
     */

    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }
    public void use(){
        inkAmount--;
    }

    public void setInkAmount(float inkAmount) {
        this.inkAmount = inkAmount;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }



    public static void main(String[] args) {
        Sharpie mySharpie = new Sharpie("blue", 10);
        System.out.println(mySharpie.toString());
        for (int i = 0; i < 5; i++) {
            mySharpie.use();
        }
        System.out.println(mySharpie.toString());

    }
}