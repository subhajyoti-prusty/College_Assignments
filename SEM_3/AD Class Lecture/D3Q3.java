//Insertion Sort
package AD;
public class D3Q3 {
    public static void InsertionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int prev = i-1;
            while((prev >= 0) && (arr[prev] > curr)){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
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
        System.out.println("Array before sorting");
        print(arr);
        InsertionSort(arr);
        System.out.println(" Array after insertion sort:");
        print(arr);       
    }    
}