import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi=3.14159265359;
		Scanner s=new Scanner(System.in);
		System.out.println("Radius");
		int r;
		r=s.nextInt();
		double SA=3*pi*r*r;
		System.out.println("The Surface area of the Hemisphere "+SA);
		double VA=(2.0/3)*pi*r*r*r;
		System.out.println("The Volume area of the Hemisphere "+VA);
		

	}

}

