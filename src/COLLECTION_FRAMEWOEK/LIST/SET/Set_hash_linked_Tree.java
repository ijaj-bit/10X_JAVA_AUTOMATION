package COLLECTION_FRAMEWOEK.LIST.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_hash_linked_Tree {
    public static void main(String[] args) {

        HashSet hs = new HashSet<>();
        // Hashing mechanism to store the element,no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
//        hs.add(123);
        hs.add(null);
        System.out.println(hs);

        System.out.println(" ---------------------------");


        LinkedHashSet lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println(" ---------------------------");

        TreeSet ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
//        ts.add(123); // java.lang.ClassCastException
        //ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);


        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
            System.out.println(o);
        }
    }
}
