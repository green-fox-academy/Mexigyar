import java.nio.file.*;

import static java.lang.Boolean.FALSE;

public class CopyFile {
    // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        copyFile("my-file.txt", "testcopy");

    }
    public static boolean copyFile(String fileName, String fileNamecopy){
        try{
            Path FROM = Paths.get(fileName);
            Path TO = Paths.get(fileNamecopy);


            CopyOption[] options = new CopyOption[]{
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(FROM, TO, options);
            Boolean succesfull = Boolean.TRUE;
            return succesfull;
        }catch (Exception e){
            boolean notsuccesfull = FALSE;
            return  notsuccesfull;
        }
    }

}
