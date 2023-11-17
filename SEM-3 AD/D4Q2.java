// Merging two sorted array :-(If A1={3,7,8,6,1} and A2{2,5,9,4} then the answer should be Ans={1,2,3,4,5,6,7,8,9})
package AD;

public class D4Q2 {
    public static void Sorting(int arr[], int L) {
        int temp = 0;
        for (int i = 0; i < L; i++) {
            for (int j = i + 1; j < L; j++) {
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

    public static Merge(int arr1[], int arr2[], int L1, int L2) {
        int[] result = new int[L1 + L2];
        int i = 0, j = 0, k = 0;
        while ((i < L1) && (j < L2)) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
                } else {
                    result[k++] = arr2[j++];
                }
            }
        while (i < L1) {
            result[k++] = arr1[i++];
            }
        while (j < L2) {
            result[k++] = arr2[j++];
            }
            return result;
        }

    // int index = 0;
    // int temp;
    // while (index < L1) {
    // if (arr1[index] <= arr2[0]) {
    // index += 1;
    // } else {
    // temp = arr1[index];
    // arr1[index] = arr2[0];
    // arr2[0] = temp;
    // index += 1;
    // for (int i = 0; i < L2 - 1; i++) {
    // if (arr2[i] < arr2[i + 1]) {
    // break;
    // temp = arr2[i];
    // arr2[i] = arr2[i + 1];
    // arr2[i + 1] = temp;
    // }
    // }
    // }
    // }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 5, 9, 10, 30, 15, 20 };
        int arr2[] = { 2, 24, 3, 8, 13 };
        int L1 = arr1.length;
        int L2 = arr2.length;
        Sorting(arr1, L1);
        print(arr1);
        Sorting(arr2, L2);
        print(arr2);
        Merge(arr1, arr2, L1, L2);
        print(arr1);

    }
}
