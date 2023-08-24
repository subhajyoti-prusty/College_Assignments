import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int a,sum=0,initi=n;
		while (n>0) {
			a=n%10;
			n=n/10;
			sum=sum+a;
			
		}
		if(sum%9==0)
			System.out.println("The number "+initi+" is divisible by 9");
		else
			System.out.println("The number "+initi+" is not divisible bt 9");
	

	}

}
