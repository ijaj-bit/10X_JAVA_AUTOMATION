package COLLECTION_FRAMEWOEK.LIST.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP_1 {
    public static void main(String[] args) {

        Map m = new HashMap();

        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210

        m.put("name","IJAJ");
        m.put("rollno","3");
        m.put("phone","9834983220");

        System.out.println(m);

        Map m2 = new LinkedHashMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);
        // {phone=987654321, name=pramod, rollno=1}


        Map m3 = new TreeMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
