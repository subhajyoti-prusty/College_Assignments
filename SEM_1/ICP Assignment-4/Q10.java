import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int m=0;
		for (int i=1;i<=1;i++) {
			int p=(int)(Math.pow(3,i));
			if(p<=n)
				m=p;
			
		}

		System.out.println("The largest power of 3 less than the input is :"+m);
	}

}
