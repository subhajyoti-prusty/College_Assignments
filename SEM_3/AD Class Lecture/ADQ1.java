//Sum of Nth term
package CollegeCodes;
import java.util.*;
public class ADQ1 {
    public static int SumNth(int[] arr,int n){
        int Sum =0;
        for(int i=0;i<=n;i++){
            Sum = Sum + arr[i];
        }
        return Sum;
    }
    public static void main(String[] args) {
        int Sum = 0;
        int arr[] = {4,8,6,5,9,1,3,1,0,2};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<arr.length) {
            System.out.println(SumNth(arr,n));
        } else {
            System.out.println("The Nth value you have entered is out of the array");
        }
    }
}