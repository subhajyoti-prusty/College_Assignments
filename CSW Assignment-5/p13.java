import java.util.Scanner;

public class p13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int inputNumber = scanner.nextInt();

        inputNumber = Math.abs(inputNumber);

        int[] digitFrequencies = new int[10];

        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            digitFrequencies[digit]++;
            inputNumber /= 10;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequencies[i] > 0) {
                System.out.println("Digit " + i + ": " + digitFrequencies[i] + " times");
            }
        }
    }
}
