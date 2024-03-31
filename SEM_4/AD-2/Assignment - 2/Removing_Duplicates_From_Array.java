
//Removing Duplicates From Array Using HashTable in Java
import java.util.Hashtable;

public class Removing_Duplicates_From_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5 };
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (ht.containsKey(arr[i])) {
                ht.put(arr[i], ht.get(arr[i]) + 1);
            } else {
                ht.put(arr[i], 1);
            }
        }

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            if (ht.get(arr[i]) != 0) {
                System.out.print(arr[i] + " ");
                ht.put(arr[i], 0);
            }
        }
    }
}