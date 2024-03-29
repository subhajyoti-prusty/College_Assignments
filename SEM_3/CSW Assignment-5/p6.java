public class p6
 {
    public static int divide(int x, int y) 
    {
        if (y == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int quotient = 0;
        while (x >= y) 
        {
            int multiple = 1;
            int tempY = y;
            while (x >= (tempY << 1)) 
            {
                tempY <<= 1;
                multiple <<= 1;
            }
            x -= tempY;
            quotient += multiple;
        }
        return quotient;
    }
    public static void main(String[] args) 
    {
        int x = 20;
        int y = 4;
        System.out.println("Result of " + x + " / " + y + " is: " + divide(x, y));
    }
}
