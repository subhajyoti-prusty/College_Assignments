import java.util.*;

/**
 * Class10_1
 */
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Soum");
        map.put(2, "Issue");
        map.put(3, "Sumu");
        // If the specified key is not already present in the HashMap then it will put
        // the value otherwise it

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        map.putIfAbsent(4, "XYZ");
        System.out.println(map);

        map.putIfAbsent(2, "Anisha");
        System.out.println(map);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(5, "U");

        map1.putAll(map);
        System.out.println("\nAfter putting all elements of one Map to another: \n" + map1);

        map.putAll(map1);
        System.out.println("\nAfter putting all elements of second Map to first Map:\n" + map);

        map.remove(2);
        System.out.println(map);
        map.remove(3, "Sumu");
        System.out.println(map);

        map.put(2, "Issue");
        map.put(3, "Sumu");

        map.replace(2, "Anisha");
        System.out.println(map);
        map.replace(3, "Suman");
        System.out.println(map);

        map.replaceAll((k, v) -> "Sunil Sir");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}