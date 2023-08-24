import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the A,B,C: ");
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		if(A > B && A>C) {
		System.out.print("Greatest = " +A);	
		if(B >C && B>A) {
		System.out.print("Greatest = " +B);
		if (C>A && C>B)
		System.out.print("Greatest = "+C );
		
			}
		
		}
		
	}

	
}