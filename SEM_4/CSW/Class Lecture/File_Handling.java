import java.io.File;
import java.io.IOException;
import java.util.*;

public class File_Handling {

    public static void main(String[] args) {
        try {
            File Obj = new File("myfile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created:" + Obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("an error has occured");
        }
    }
}