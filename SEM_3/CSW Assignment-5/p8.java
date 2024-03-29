public class p8 
{

    public static int reverse(int number) {
        int reversedNumber = 0;

        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int input1 = 123;
        int input2 = -245;

        System.out.println("Reverse of " + input1 + " is: " + reverse(input1));
        System.out.println("Reverse of " + input2 + " is: " + reverse(input2));
    }
}
