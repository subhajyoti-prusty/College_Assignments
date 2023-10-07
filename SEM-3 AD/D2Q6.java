//Conversion of decimal to hexadecimal using recursive method 
package AD;
public class D2Q6 {
    public static void DecToHex(int n){
        char[] DecNum = new char[100];
        int i=0;
        while (n != 0) {
            int temp = n;
            temp = n%16;
            if (temp < 10) {
                DecNum[i] = (char) (temp+48);
                i++;
            }else{
                DecNum[i] = (char) (temp+55);
                i++;
            }
            n=n/16;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.println(DecNum[j]);
        }
    }
    public static void main(String[] args) {
        int n = 241;
        DecToHex(n);
    }    
}