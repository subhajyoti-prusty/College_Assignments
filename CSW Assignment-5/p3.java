public class p3 {

    public static int swapBits(int number, int i, int j) 
    {
        int bit_i = (number >> i) & 1;
        int bit_j = (number >> j) & 1;

        number = number & ~(1 << i) | (bit_j << i);
        number = number & ~(1 << j) | (bit_i << j);

        return number;
    }

    public static void main(String[] args) {
        int number = 23;
        int i = 2;      
        int j = 4;      
        System.out.println("Original number: " + Integer.toBinaryString(number));
        int result = swapBits(number, i, j);
        System.out.println("Number after swapping bits: " + Integer.toBinaryString(result));
    }
}
