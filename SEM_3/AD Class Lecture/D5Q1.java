// Finding first repeated element in an arra
package AD;

public class D5Q1 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 6, 8, 9, 2 };

        int firstRepeatedElement = findFirstRepeatedElement(arr);

        if (firstRepeatedElement != -1) {
            System.out.println("First Repeated Element is: " + firstRepeatedElement);
        } else {
            System.out.println("No repeated elements found");
        }
    }

    public static int findFirstRepeatedElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // First repeated element found
                }
            }
        }

        return -1; // No repeated elements found
    }
}
