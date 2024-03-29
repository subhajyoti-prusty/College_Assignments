//Finding the GCD using recursive method 
package AD;
import java.util.Scanner;
public class D2Q5 {
    public static int gcd(int a,int b){
        if (b !=0) {
            return gcd(b , a%b);
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int a=sc.nextInt();
        System.out.println("Enter the second numbers");
        int b=sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is "+gcd(a, b));
    }    
}