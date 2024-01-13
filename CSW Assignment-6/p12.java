import java.util.Scanner;

public class p12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String inputString = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(inputString);
            System.out.println("Converted int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer as a string.");
        }
    }
}
