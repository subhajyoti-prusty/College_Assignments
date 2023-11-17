// Factorial of a number
package AD;
import java.util.*;
public class D1Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the number to find its factorial");
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >0; i--) {
           fact = fact*i;
        }
        System.err.println("The factorial of the number "+n+" is "+fact);
    }
}