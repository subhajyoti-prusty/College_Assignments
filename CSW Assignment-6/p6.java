import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float as a string: ");
        String inputString = scanner.nextLine();
        try {
            Float floatValue = Float.valueOf(inputString);
            System.out.println("Original string: " + inputString);
            System.out.println("Converted Float object: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid float as a string.");
        }
    }
}
