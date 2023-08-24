import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Input first number: ");
		a = s.nextInt();
		System.out.println("Input Second number: ");
		b = s.nextInt();
		System.out.println("Input Third number: ");
		c = s.nextInt();
		if (a>b && b>c)
		{
            System.out.println("Decreasing");
        }
		else if (a<b && b<c)
        {
            System.out.println("Increasing");
        }
		else
		{
			System.out.println("Nither Increasing or Decreasing");
		}
	}

}
