import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Thher amout of water you drink in ml: ");
		int water;
		water = s.nextInt();
		if (water>=5000)
		{
            System.out.println("Yes");
        }
		else
        {
            System.out.println("No");
        }
		

	}

}
