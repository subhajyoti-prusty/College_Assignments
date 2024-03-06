// Map Interface

// - Map is a key value pair
// 1. HashMap
// 2. HashTable
// 3. TreeMap
// 4.  LinkedHashMap (access ordered)

// HashMap in Java 
// It is collection class that uses the system of pairs, where one is the key and other is the value 
// The objects the are stored in the collection don't have to be ordered as it is employed to find any value using corresponding key.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        hmap1.put(14, "George");
        hmap1.put(33, "Paul");
        hmap1.put(16, "Jane");
        hmap1.put(7, "Brian");
        hmap1.put(19, "Jack");
        Set set1 = hmap1.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry ment1 = (Map.Entry) iterator1.next();
            System.out.println("The value is: " + ment1.getValue() + " and key is: " + ment1.getKey());
        }
        String va = hmap1.get(2);
        System.out.println("Index 2 has value of " + va);
        hmap1.remove(16);
        Set set2 = hmap1.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry ment2 = (Map.Entry) iterator2.next();
            System.out.println("Now value is " + ment2.getValue() + "and key is: " + ment2.getKey());
        }
    }
}