//Find the missing number in an array
package AD;

public class D5Q3 {
    public static int findMissingNumber(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            System.out.println("Array is empty");
            return -1; // or any other suitable value to indicate no missing number
        }

        boolean[] foundArray = new boolean[n + 2];

        for (int num : arr) {
            foundArray[num] = true;
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!foundArray[i]) {
                return i;
            }
        }
        return -1; // or any other suitable value to indicate no missing number
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4 };
        int missingNumber = findMissingNumber(arr);
        if (missingNumber != -1) {
            System.out.println("The missing number is: " + missingNumber);
        } else {
            System.out.println("No missing number found");
        }
    }
}

// public static void main(String[] args) {
// int arr[] = {1, 2, 4};
// int missingNumber = findMissingNumber(arr);
// if (missingNumber != -1) {
// System.out.println("The missing number is: " + missingNumber);
// } else {
// System.out.println("No missing number found");
// }
// }
