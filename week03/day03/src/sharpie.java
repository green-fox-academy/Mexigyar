public class sharpie {
    /*
    Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
     */

    String color;
    float width;
    float inkAmount;

    public sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }
    public void use(){
        inkAmount--;
    }

    @Override
    public String toString() {
        return "sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }

    public static void main(String[] args) {
        sharpie mySharpie = new sharpie("blue", 10);
        System.out.println(mySharpie.toString());
        for (int i = 0; i < 5; i++) {
            mySharpie.use();
        }
        System.out.println(mySharpie.toString());

    }
}