import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N=s.nextInt();
		int sum=0;
		for(int i=1;i<N;i++) {
			
			if(N%i==0) {
				System.out.println(i);
			sum=sum+i;
			}
		}
			System.out.println("sum is: "+sum);
			if(sum==N)
				System.out.println("It is a perfect number.");
			else
				System.out.println("It is not a perfect number.");

	}

}
