import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=s.nextInt();
		System.out.println("Enter thr second number: ");
		int b=s.nextInt();
		int i,j;
		for(i=a;i<=b;i++) 
		{
			System.out.println("The multiplication table of "+i);
			for(j=1;j<=10;j++) 
			{
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}

	}

}
