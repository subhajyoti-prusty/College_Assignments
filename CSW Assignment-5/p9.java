public class p9
{
    public static boolean isPalindrome(int number) 
    {
        if (number < 0) 
        {
            return false;
        }
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) 
        {
            int digit = number % 10;
            reversedNumber = (reversedNumber << 1) | digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) 
    {
        int palindromeNumber = 121;
        int nonPalindromeNumber = 123;

        System.out.println(palindromeNumber + " is a palindrome: " + isPalindrome(palindromeNumber));
        System.out.println(nonPalindromeNumber + " is a palindrome: " + isPalindrome(nonPalindromeNumber));
    }
}