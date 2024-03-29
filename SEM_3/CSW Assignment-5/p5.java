public class p5
 {
    public static long multiply(int x, int y) 
    {
        long result = 0;
        while (y != 0) 
        {
            if ((y & 1) == 1) 
            {
                result = add(result, x);
            }
            x <<= 1;
            y >>>= 1;
        }
        return result;
    }
    public static long add(long a, long b) 
    {
        while (b != 0) 
        {
            long carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("Product of " + x + " and " + y + " is: " + multiply(x, y));
    }
}
