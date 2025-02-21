package COLLECTION_FRAMEWOEK.LIST.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL_iteration {


    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println(" - To Print Arraylist - 1 ");

        //for loop

        for (int i = 0; i <mylist.size() ; i++) {
            System.out.println(mylist.get(i));

        }

        System.out.println(" - To Print Arraylist - 2");
        for (Object o :mylist)
        {
            System.out.println(o);
        }

        System.out.println("-To Print Arraylist -3");
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
