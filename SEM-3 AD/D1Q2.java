// Finding Max and min number
package AD;
public class D1Q2 {
    public static int MAX(int[] arr){
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if (max< arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int MIN(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {4,8,6,5,9,1,3,1,0,2};
        System.out.println("Max: "+MAX(arr));
        System.out.println("Min: "+MIN(arr));
    }
}
