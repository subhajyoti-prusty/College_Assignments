// Array reducton :- (Get the smallest element in the array and the subtract it from rest of the array )
package AD;

public class D4Q1 {
    public static void Sorting(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // public static int SmallestElement(int arr[], int n) {
    // int MinValue = Integer.MAX_VALUE;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] < MinValue) {
    // MinValue = arr[i];
    // }
    // }
    // // System.out.println("Smallest Element is : " + MinValue);
    // return MinValue;
    // }

    public static void Reduction(int arr[], int n) {
        int index = 1;
        int redu = arr[0];
        int minVal = arr[index];
        for (int i = 1; i < n; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] - redu > 0) {
                redu = arr[i];
                index += 1;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 1, 1, 2, 3, 5 };
        int n = arr.length;
        print(arr);
        Sorting(arr, n);
        print(arr);
        // SmallestElement(arr, n);
        Reduction(arr, n);
    }
}
