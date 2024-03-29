import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a=s.nextInt();
		System.out.println("Enter thr second no.");
		int b=s.nextInt();
		System.out.println("Enter thr Third no.");
		int c=s.nextInt();
		
		int sum=0;
		for(int i=a;i<=b;i=i+c) {
			System.out.print(i+" ");
			sum=sum+i;
			
		}
			System.out.println();
			System.out.println("The sum of the number displayed is "+sum);

	}

}
