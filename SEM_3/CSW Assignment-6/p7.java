import java.util.Scanner;

public class p7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double as a string: ");
        String inputString = scanner.nextLine();
        try {
            Double doubleValue = Double.valueOf(inputString);
            System.out.println("Original string: " + inputString);
            System.out.println("Converted Double object: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double as a string.");
        }
    }
}
