//write a program to swap the ith bit with jth bit of a number
package CSW;

public class rough {
    public static void main(String[] args) {
        long inputword = 0b10101110101010101011101010101011110L;
        System.out.println("Real word : " + Long.toBinaryString(inputword));

        long reverseword = reverseBits(inputword);
        System.out.println("Reversed word : " + Long.toBinaryString(reverseword));
    }

    public static long reverseBits(long input) {
        long result = 0;
        int numOfBits = 64;
        for (int i = 0; i < numOfBits; i++) {
            result = (result << 1) | (input & 1);
            input >>= 1;
        }
        return result;
    }

}
