import java.util.Scanner;
public class p11
{
    public static int countEvenDigits(int number) 
    {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) 
        {
            int digit = number % 10;
            if (digit % 2 == 0) 
            {
                count++;
            }
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int inputNumber = scanner.nextInt();
        int evenDigitCount = countEvenDigits(inputNumber);
        System.out.println("Number of even digits: " + evenDigitCount);
    }
}
