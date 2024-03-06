import java.util.HashSet;
import java.util.Iterator;

// SetInterface
// - Doesn't allow duplicates.
// - If two identical objects found only one of them will get inserted.

// 1. HashSet
// 2. LinkedHashSet
// 3. TreeSet

// HashSet
// - Used to create a collection that uses a hashtable for storage.
// - It inherits from abstract class AbstractSet and implements Iterable interface.
// - Allow null value.
// - Non Synchronized.
// - Doesn't maintain the insertion order.
// - Inserted basis of their hashcode.
// - Hashset is best for search operation.

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        // Using java.util.Iterator
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("The set is: " + set);

        set.add("three");
        System.out.println(set);
    }
}
