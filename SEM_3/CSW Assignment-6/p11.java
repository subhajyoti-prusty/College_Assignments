import java.util.Scanner;

public class p11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double as a string: ");
        String inputString = scanner.nextLine();

        try {
            double doubleValue = Double.parseDouble(inputString);
            System.out.println("Converted double value: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double as a string.");
        }
    }
}
