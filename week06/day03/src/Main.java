import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        fileHandler.importList(container);
        argHandler.argHandler(args, container);
        fileHandler.saveToFile(container);

    }
}



