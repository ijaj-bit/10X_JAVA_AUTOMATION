package COLLECTION_FRAMEWOEK.LIST.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
// Array List and Linked List are same....
public class AL_LL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");

        System.out.println(l);


        ArrayList l2 = new ArrayList();
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");

        System.out.println(l2);
    }
}
