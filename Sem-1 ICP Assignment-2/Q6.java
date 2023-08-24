import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of seconds");
		double t ;
		t=s.nextDouble();
		double g;
		g=32.174;
		double D=(1.0/2)*g*t*t;
		System.out.println("Distance travelled "+D);

	}

}
