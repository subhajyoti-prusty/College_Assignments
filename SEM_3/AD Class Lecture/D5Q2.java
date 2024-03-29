//Print all the duplicates in a array
package AD;

import java.util.HashMap;

public class D5Q2 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 8, 9, 7, 9, 3, 8, 5, 2 };
        printDuplicates(arr);
    }

    public static void printDuplicates(int[] arr) {
        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!hasDuplicates) {
                        System.out.println("Duplicate elements:");
                        hasDuplicates = true;
                    }
                    System.out.println(arr[j]);
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }
}
