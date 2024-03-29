
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Distance in KiloMeter");
		double KM;
		KM=s.nextDouble();
		double M;
		M=KM*(1000);
		double F;
		F=KM*(3280.8399);
		double I;
		I=KM*(39370.0787);
		double CM;
		CM=KM*(100000);
		System.out.println("Distance in Meter:"+M);
		System.out.println("Distance in Feet:"+F);
		System.out.println("Distance in Inches:"+I);
		System.out.println("Distance in Centimeter:"+CM);

	}

}

