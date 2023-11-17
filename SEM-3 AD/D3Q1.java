//Bubble Sort
package AD;
public class D3Q1 {
    public static void BubbleSort(int arr[]){
        int a = arr.length;
        for (int i = 0; i < a-1; i++) {
            for ( int j = 0; j < a-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,4,8,6,7,3,1,5,9};
        BubbleSort(arr);
        print(arr);
    }    
}