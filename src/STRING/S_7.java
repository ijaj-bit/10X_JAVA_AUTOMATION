package STRING;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S_7 {
    public static void main(String[] args) {

        String str1 = "Hello"; // Creates or reuses "Hello" in the String pool
        String str2 = "Hello"; // Reuses the "Hello" from the String pool

        String str3 = new String("Hello");// Creates a new object on the heap


        System.out.println(str1==str2);// true, both refer to the same object in the pool
        System.out.println(str1==str3); // false, str3 is a new object in the heap
        System.out.println(str1.equals(str3)); // true, because the content is the same

        // Practice
        String name1 = "IJAJ";
        String name2 = "SHAIKH";

        //1.charAt()

        System.out.println(name1.charAt(3));

        //2.Concat
        System.out.println(name1.concat(name2));

        // 3. contains()
        System.out.println(name1.contains("IJAJ"));

        // 4. equals()
        System.out.println(name1.equals("IJAJ"));

        // 5. equalsIgnoreCase()
        System.out.println(name1.equalsIgnoreCase("iJAJ"));

        // 6. indexOf()
        System.out.println(name1.indexOf("A"));

        // 7. length()
        System.out.println(name1.length());

        // 8. replace( , )
        System.out.println(name1.replace("I","i"));

        // 9. split()
        String name4 = "IJAJ SHAIKH";
        String[] split=name4.split("");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10. substring( , )
        System.out.println(name1.substring(1,3));//IJAJ

        // 11. toLowerCase()
        System.out.println(name1.toLowerCase());

        // 12. toUpperCase()
        System.out.println(name1.toUpperCase());

        // 13. replaceAll()
        System.out.println(name1.replaceAll("","YUSUF"));

        // 14. startsWith()
        System.out.println(name1.startsWith("I"));

        // 15. endsWith()
        System.out.println(name1.endsWith("L"));//endswith J

        // 16. isEmpty()

        System.out.println(name1.isEmpty());

        // 17. trim()
        String name3 = " IJAJ SHAIKH  ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name1.compareTo("A"));

        // 19. compareToIgnoreCase()
        System.out.println(name1.compareToIgnoreCase("ijaj"));

        // 20. lastIndexOf()
        System.out.println(name1.lastIndexOf("j"));


        // 21. repeat()
        System.out.println(name1.repeat(2));

        //22.String Builder
        StringBuilder x = new StringBuilder("WINDOWS ");
        x.append("11");
        System.out.println(x);


        //23.

        String s1 = "HELLO WORLD ";
        String s2 = "HI";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s1);

    }
}
