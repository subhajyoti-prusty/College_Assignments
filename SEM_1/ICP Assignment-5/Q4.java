import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int m=s.nextInt();
		System.out.println("Enter thr second number: ");
		int n=s.nextInt();
		int i,j,fact=1;
		for(i=m;i<=n;i++) 
		{fact=1;
			for(j=1;j<=i;j++) 
			{
				fact=fact*j;
			}System.out.println("Factorial of "+i+" is: "+fact);
		}

	}

}
