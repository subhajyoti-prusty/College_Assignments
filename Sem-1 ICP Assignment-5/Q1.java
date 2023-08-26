import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=s.nextInt();
		System.out.println("Enter thr second number: ");
		int b=s.nextInt();
		int i,j,sum1=0,sum2=0;
		for(i=1;i<a;i++) {
			if(a%i==0) {
				sum1=sum1+i;
				System.out.print(i+" ");
				
			}
		}
		System.out.println();
		System.out.println("sum is "+sum1);
		
		for(j=1;j<b;j++) {
			if(b%j==0) {
				sum2=sum2+j;
				System.out.print(j+" ");
				
			}
		}
		System.out.println();
		System.out.println("sum is "+ sum2);
		
		if(sum1==b&&sum2==a) {
			System.out.println("They are amicable numbers");
		}

	}

}
