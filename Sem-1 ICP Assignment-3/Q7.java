import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of units consumed");
		int units = s.nextInt();
		if(units < 50) {
			double bill= 3*units;
			System.out.print("Do you want to pay online(Y/N): ");
			String choice = s.next();
			switch (choice) {
			case ("Y"): double discount= 0.3*bill;
			double amount=bill-discount;
			System.out.print("Total amount: "+bill);
			System.out.print("Discount: "+discount);
			System.out.print("Amount: "+amount);
			}*/
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
				//System.out.println("Electricity bill in :" +bill);
			}
			else if (u>=200 && u<=400)
			{
				bill=5.80*(u-200)+(50*3)+(150*4.80);
				//System.out.println("Electricity bill in :" +bill);
			}
			else if(u<=400)
			{
				bill=6.20*(u-400)+(50*3)+(150*4.80)+(200*5.80);
				//System.out.println("Electricity bill in :" +bill);
			}
		else
		{
			 bill=((50*3)+(150*4.80)+(200*5.80)+(u-400)*6.20);
			 System.out.println("Electricity bill in :" +bill);
			 System.out.print("Do you want to pay online(Y/N): ");
			 char ans=s.next().charAt(0);
			 if (ans=='Y')
				 System.out.print("bill: "+bill*0.03);
			 System.out.print("bill: "+bill);
			
		}
		// Ghar mai kar 

	}

}
