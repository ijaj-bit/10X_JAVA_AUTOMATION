package COLLECTION_FRAMEWOEK.LIST.MAP;

import java.util.HashMap;
import java.util.Map;

public class MAP_ITERATOR {

    public static void main(String[] args) {
        Map<String,String> m = new HashMap();

        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210

        m.put("name","IJAJ");
        m.put("rollno","3");
        m.put("phone","9834983220");

        for(Map.Entry<String,String> item :m.entrySet())
        {
            System.out.println(item.getKey()+"-->"+item.getValue());
        }

    }
}
