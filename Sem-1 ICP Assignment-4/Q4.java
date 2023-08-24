import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x=s.nextInt();
		System.out.println("Enter the Second number: ");
		int y=s.nextInt();
		int rem;
		while(y!=0)
		{
			rem=x%y;
			x=y;
			y=rem;
			
		}
		System.out.println("GCD: "+x);
	}
}

