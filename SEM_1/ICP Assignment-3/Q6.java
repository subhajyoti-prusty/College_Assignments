import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your electricity bill in units: ");
		int u;
		double bill;
		u = s.nextInt();
		if (u<=50)
		{
			bill=3*u;
			System.out.println("Electricity bill in :" +bill);
		}
			else if (u>=50 && u<=200)
			{
				bill=4.80*(u-50)+(50*3);
				System.out.println("Electricity bill in :" +bill);
			}
			else if (u>=200 && u<=400)
			{
				bill=5.80*(u-200)+(50*3)+(150*4.80);
				System.out.println("Electricity bill in :" +bill);
			}
			else if(u<=400)
			{
				bill=6.20*(u-400)+(50*3)+(150*4.80)+(200*5.80);
				System.out.println("Electricity bill in :" +bill);
			}
		else
		{
			 bill=((50*3)+(150*4.80)+(200*5.80)+(u-400)*6.20);
			 System.out.println("Electricity bill in :" +bill);
		}

	}

}
