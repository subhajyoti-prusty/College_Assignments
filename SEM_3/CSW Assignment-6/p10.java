import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression (e.g., 123+345 or 5*10): ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s", "");

        if (input.matches(".*[+\\-*/].*")) {
            String[] parts = input.split("[+\\-*/]");

            double operand1 = Double.parseDouble(parts[0]);
            double operand2 = Double.parseDouble(parts[1]);

            char operator = input.charAt(parts[0].length());

            switch (operator) {
                case '+':
                    System.out.println("Sum = " + (operand1 + operand2));
                    break;
                case '-':
                    System.out.println("Difference = " + (operand1 - operand2));
                    break;
                case '*':
                    System.out.println("Product = " + (operand1 * operand2));
                    break;
                case '/':
                    if (operand2 != 0) {
                        System.out.println("Quotient = " + (operand1 / operand2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
        } else {
            System.out.println("Invalid input. Please provide an expression with an operator (+, -, *, /).");
        }
    }
}
