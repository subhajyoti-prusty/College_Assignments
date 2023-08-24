
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Temperature in Degree farenheit");
double farenheit;
farenheit=s.nextDouble();
double celsius;
celsius=(farenheit-32)*(5.0/9);
System.out.println("Temperature in Degree celsius"+celsius);

	}

}

