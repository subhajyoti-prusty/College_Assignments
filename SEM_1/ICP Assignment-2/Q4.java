import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a intger between 0 to 1000");
		int x ;
		x=s.nextInt();
		int A=x%10;
		System.out.println(A);
		int B=(x%100)/10;
		System.out.println(B);
		int C=x/100;
		System.out.println(C);
		int S=(A+B+C);
		System.out.println("The sum of the digits is "+S);

	}

}
