package CSW_2;

import java.util.*;

// LinkedHashSetIt
class LinkedHashSetIt {
    public static void main(String args[]) {
        // Creating HashSet and adding elements
        LinkedHashSet<String> linked_set = new LinkedHashSet();

        linked_set.add("One");
        linked_set.add("Two");
        linked_set.add("Three");
        linked_set.add("Four");
        linked_set.add("Five");

        Iterator<String> i = linked_set.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
