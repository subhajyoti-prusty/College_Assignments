import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Input the year");
		
		int y=s.nextInt();
		System.out.println(y+" is a leap year: ");
		if((y%100!=0 && y%4==0)||y%400==0)
		{	
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}

