package CSW_2.Class18;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class File_Handling_Read {
    public static void main(String[] args) {
        try {
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);

            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
        }
    }

}