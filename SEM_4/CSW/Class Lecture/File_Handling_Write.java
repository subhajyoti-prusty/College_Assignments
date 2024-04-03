package CSW_2.Class18;

import java.io.FileWriter;
import java.io.IOException;

public class File_Handling_Write {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("Hello, i have written something for you");
            Writer.close();
            System.out.println("Successfully written");

        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}