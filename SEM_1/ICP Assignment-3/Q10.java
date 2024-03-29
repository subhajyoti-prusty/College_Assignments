import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the  marks obtained: ");
		int marks = s.nextInt();
		int grade = marks/10;
		switch (grade) {
		case (1):System.out.print("The grade obtained is F");
		break;
		case (2):System.out.print("The grade obtained is F");
		break;
		case (3):System.out.print("The grade obtained is F");
		break;
		case (4):System.out.print("The grade obtained is E");
		break;
		case (5):System.out.print("The grade obtained is D");
		break;
		case (6):System.out.print("The grade obtained is C");
		break;
		case (7):System.out.print("The grade obtained is B");
		break;
		case (8):System.out.print("The grade obtained is A");
		break;
		case (9):System.out.print("The grade obtained is O");
		break;
		case (10):System.out.print("The grade obtained is O");
		break;
		}

	}

}
