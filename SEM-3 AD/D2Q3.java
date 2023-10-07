// Factorial of a number using recursive method 
package AD;
import java.util.Scanner;
public class D2Q3 {
    public static int fact(int n){
        int fact = 1;
        if (n==0 || n==1) {
            return n;
        }
        for (int i = n; i >0; i--) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find its factorial:");
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of the "+n+"th term is "+fact(n));
        sc.close();
    }    
}