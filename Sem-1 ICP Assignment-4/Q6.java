import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Base number: ");
		int Base=s.nextInt();
		System.out.println("Enter the Power number: ");
		int Power=s.nextInt();
		
		int a=1;
		while (Power>0)
		{
			a= Base*a;
			Power--;
		System.out.println("The power is :" +a);
		}

	}
	

}
