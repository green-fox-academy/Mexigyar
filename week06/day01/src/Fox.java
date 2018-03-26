import java.util.ArrayList;

public class Fox {
    String name;
    String type;
    String color;

    public Fox(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fox fox1 = new Fox("Jon", "pallida", "green");
        Fox fox2 = new Fox("Jonny", "none", "green");
        Fox fox3 = new Fox("Carl", "pallida", "blue");
        Fox fox4 = new Fox("Megan", "none", "red");
        Fox fox5 = new Fox("Jeremmy", "pallida", "green");

        ArrayList<Fox> foxes = new ArrayList();
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);


        foxes
                .stream()
                .filter(x -> "green".equals(x.color) && "pallida".equals(x.type))
                .map(x -> x.toString())
                .forEach(System.out::println);
    }

}
