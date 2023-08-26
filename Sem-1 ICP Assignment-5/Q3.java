import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=s.nextInt();
		System.out.println("Enter thr second number: ");
		int b=s.nextInt();
		int i,j,c;
		for(i=a;i<=b;i++) 
		{
			c=0;
			for(j=1;j<=i;j++) 
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			System.out.println(i);
		}

	}

}
