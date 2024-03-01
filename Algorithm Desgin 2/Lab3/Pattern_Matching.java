import java.util.Scanner;

public class Pattern_Matching {
    public static void search(String text, String pattern) {
        int M = pattern.length();
        int N = text.length();

        boolean patternFound = false;

        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                System.out.println("Pattern found at index " + i);
                patternFound = true;
                break;
            }
        }

        if (!patternFound) {
            System.out.println("Pattern not found in the given text. Please try again.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Pattern Matching");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        System.out.println("Enter the pattern to be searched for: ");
        String pattern = sc.nextLine();

        System.out.println("The pattern is found at the following index: ");
        search(text, pattern);
    }
}
