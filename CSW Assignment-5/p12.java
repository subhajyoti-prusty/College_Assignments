import java.util.Scanner;

public class p12 {

    public static int combineDigits(int number1, int number2) {
        int firstTwoDigits = Math.abs(number1) / 100;
        int lastTwoDigits = Math.abs(number2) % 100;
        int result = firstTwoDigits * 100 + lastTwoDigits;
        if (number1 < 0) {
            result = -result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int inputNumber1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int inputNumber2 = scanner.nextInt();

        int combinedNumber = combineDigits(inputNumber1, inputNumber2);

        System.out.println("Combined number: " + combinedNumber);
    }
}
