package COLLECTION_FRAMEWOEK.LIST.LIST;

import java.util.ArrayList;

public class LIST_1 {
    public static void main(String[] args) {
//        List CAR = List.of("BMW","AUDI","MERC","BYD");
//        System.out.println(CAR);
//        // Static method can be fully implemented in interface.
//        // Default method - can full implemented in interface
//        CAR.add("JEEP");// java.lang.UnsupportedOperationException
//        CAR.remove("BMW");//Not Possible....

        System.out.println("----------------------------------------------");

        ArrayList arrayList = new ArrayList<>();
        arrayList.add("BLACK");
        arrayList.add("BLUE");
        arrayList.add(null);//NULL VALUE ARE ALLOWED....
        arrayList.add("BLACK");//DUPLICATES ARE ALLOWED...
        arrayList.add(null);
        arrayList.remove("BLUE");
        System.out.println(arrayList);
    }
}
