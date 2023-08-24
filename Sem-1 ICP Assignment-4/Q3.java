import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N=s.nextInt();
		int a, sum=0,i=1;
		do {
			a=1+(int)((N)*Math.random());
				System.out.println("Random numbers generated are :"+a);
				sum=sum+a;
				i++;
			
		}
		while(i<=N);
		int avg=sum/N;
		System.out.println("Avg of "+N+" random numbers are "+ avg);
			
	}

}


