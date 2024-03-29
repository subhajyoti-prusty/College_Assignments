//Given an array of integers, find the element paired with maximun/minimum difference 
package AD;

public class D5Q4 {
    public static void FindingDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }
        int minElement = arr[0];
        int maxElement = arr[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }

            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }

            int currentDifference = arr[i] - arr[i - 1];
            if (currentDifference < min) {
                min = currentDifference;
            }

            if (currentDifference > max) {
                max = currentDifference;
            }
        }
        System.out.println("Pair with minimum difference: " + (minElement - min) + " and " + (minElement));
        System.out.println("Pair with maximum difference: " + (maxElement - max) + " and " + (maxElement));
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 7, 5, 2, 8, 7 };
        FindingDifference(arr);
    }
}