// Nth Fibonacci number
package AD;
import java.util.Scanner;
public class D1Q4 {
    public static int Fibo(int n){
        if (n==0 ||  n==1) {
            return n;            
        }
        else{
            return Fibo(n-2)+Fibo(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Nth number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Fibonacci serise for the "+n+"th number is:"+Fibo(n));
    }
}
