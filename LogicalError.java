public class LogicalError {
    // ERROR HANDLING
    // Logical Error
    public static void main(String[] args) {
        int var1 = 5 + 4 * 3 / 2;
        int var2 = (5 + 4) * 3 / 2;
        int var3 = (5 + 4) * (3 / 2);
        int var4 = (5 + (4 * 3)) / 2;

        System.out.println("Value  of var1: " + var1);
        System.out.println("Value  of var2: " + var2);
        System.out.println("Value  of var3: " + var3);
        System.out.println("Value  of var4: " + var4);

        int c;
        for (c = 0; c <= 10; c++)
            ;
        {
            System.out.println("Counter is  : " + c);
        }
    }
}
