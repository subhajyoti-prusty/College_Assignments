import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=1 + (int)((9)*Math.random());
		System.out.println("enter user number:");
		int b=s.nextInt();
		System.out.println("Computer guess: "+a);
		if((a+1)==b||(a-1)==b)
			System.out.println("Almost got it right");
		else if(a==b)
			System.out.println("You got it right");
		else
			System.out.println("You got it wrong");
		

	}

}
