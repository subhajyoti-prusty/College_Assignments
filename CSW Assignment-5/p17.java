public class p17 {

    public static boolean isEven(int number) {
        return (number & 1) == 0;
    }

    public static void main(String[] args) {
        int testNumber1 = 8;
        int testNumber2 = 15;

        System.out.println(testNumber1 + " is even: " + isEven(testNumber1));
        System.out.println(testNumber2 + " is even: " + isEven(testNumber2));
    }
}
