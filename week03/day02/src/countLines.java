import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class countLines {// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) {

        System.out.println(linesOfTheFile("day02.iml"));
    }
    public static int linesOfTheFile(String fileName){
        try{
            Path filePath = Paths.get(fileName);
            long numberOfLines = Files.lines(filePath).count();
            int CountedLines = (int) numberOfLines;
            return CountedLines;
        }catch (Exception e) {
            return  0;
        }

    }
}
