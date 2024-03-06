import java.util.Enumeration;
import java.util.Hashtable;

// HashTable

// - Similar to HashMap
// - It creates a table of key and values resulting in the production of synchronized set of objects

public class HashTable {
    public static void main(String args[]) {
        Enumeration<Integer> nms;
        Integer key;
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Adam");
        hashtable.put(2, "Brian");
        hashtable.put(3, "Charles");
        hashtable.put(4, "Dean");
        hashtable.put(5, "Peter");
        nms = hashtable.keys();
        while (nms.hasMoreElements()) {
            key = nms.nextElement();
            System.out.println("Key is " + key + " & value is " + hashtable.get(key));
        }

        hashtable.remove(2);
        System.out.println(hashtable);

        System.out.println(hashtable.getOrDefault(1, "Not Found"));
        System.out.println(hashtable.getOrDefault(10, "Not Found"));

    }
}
