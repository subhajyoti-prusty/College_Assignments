import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the basic salary");
		double x ;
		x=s.nextDouble();
		double DA;
		DA=(x/10)*4;
		double HRA;
		HRA=(x/10)*2;
		double GS;
		GS=x+DA+HRA;
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.println("GS is "+GS);

	}

}
