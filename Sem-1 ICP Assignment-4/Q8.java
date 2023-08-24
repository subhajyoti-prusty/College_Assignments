import java.util.Random;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

        int answer, guess;
        final int MAX = 100;
        Scanner s = new Scanner(System.in);
        boolean correct = false;
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;
        while (!correct) {
   System.out.println("Guess a number between 1 and 100: ");
            guess = s.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again");
            }
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }
            else {
  
                System.out.println(
                    "Yes, you guessed the number.");
  
                correct = true;
            }
        }
        System.exit(0);

	}

}
