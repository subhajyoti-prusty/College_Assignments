//Sum of Nth term using recursive method 
package AD;
import java.util.Scanner;
public class D2Q1 {
    public static int Sum (int n){
        int sum=0;
        if (n==0 || n==1){
            return n;
        }
        for (int i=n; i>0; i--) {
            sum = sum +i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enetr the nth number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println ("The "+n+"th element is : " + Sum(n));

    }    
}