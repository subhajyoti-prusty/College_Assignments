import java.util.Scanner;

public class p9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String intString = scanner.nextLine();
        Integer integerValue = Integer.valueOf(intString);
        System.out.println("Converted Integer object: " + integerValue);

        System.out.print("Enter a float as a string: ");
        String floatString = scanner.nextLine();
        Float floatValue = Float.valueOf(floatString);
        System.out.println("Converted Float object: " + floatValue);

        System.out.print("Enter a double as a string: ");
        String doubleString = scanner.nextLine();
        Double doubleValue = Double.valueOf(doubleString);
        System.out.println("Converted Double object: " + doubleValue);

        System.out.print("Enter a boolean as a string (true or false): ");
        String booleanString = scanner.nextLine();
        Boolean booleanValue = Boolean.valueOf(booleanString);
        System.out.println("Converted Boolean object: " + booleanValue);
    }
}
