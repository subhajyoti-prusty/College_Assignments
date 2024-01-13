import java.util.Scanner;
public class p10
{
    public static boolean isClose(float num1, float num2, float epsilon) 
    {
        float difference = Math.abs(num1 - num2);
        return difference < epsilon;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();
        System.out.print("Enter the tolerance value (epsilon): ");
        float epsilon = scanner.nextFloat();
        boolean result = isClose(num1, num2, epsilon);
        System.out.println("The difference between the numbers is less than epsilon: " + result);
    }
}