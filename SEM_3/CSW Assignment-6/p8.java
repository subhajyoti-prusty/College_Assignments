import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean as a string (true or false): ");
        String inputString = scanner.nextLine();
        try {
            Boolean booleanValue = Boolean.valueOf(inputString);

            // Display the results
            System.out.println("Original string: " + inputString);
            System.out.println("Converted Boolean object: " + booleanValue);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter 'true' or 'false' as a string.");
        }
    }
}
