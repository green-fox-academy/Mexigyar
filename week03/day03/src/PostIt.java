public class PostIt {
    /*Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!" */

    private String backgroungColor;
    private String text;
    private String textColor;

    public PostIt(String backgroungColor, String text, String textColor) {
        this.backgroungColor = backgroungColor;
        this.text = text;
        this.textColor = textColor;
    }

    @Override
    public String toString() {
        return "PostIt{" +
                "backgroungColor='" + backgroungColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public static void main(String[] args) {
        PostIt myPostIt = new PostIt("black", "drink coffee", "white");
        PostIt MyPostIt2 = new PostIt("orange",  "Idea 1", "blue");
        PostIt MyPostIt3 = new PostIt("pink", "Awsome", "black");
        PostIt MyPostIt4 = new PostIt("yellow", "gSuperb!", "green");

        System.out.println(myPostIt.toString());
        myPostIt.setTextColor("Very White");
        System.out.println(myPostIt.toString());
    }

}
