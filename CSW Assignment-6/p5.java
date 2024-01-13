import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer as a string: ");
        String inputString = scanner.nextLine();
        try {
            Integer integerValue = Integer.valueOf(inputString);
            System.out.println("Original string: " + inputString);
            System.out.println("Converted Integer object: " + integerValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer as a string.");
        }
    }
}
