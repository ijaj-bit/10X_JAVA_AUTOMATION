package STRING.TASK;

import java.lang.StringBuffer;

public class Convert_Stringbuffer_to_string {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("IJAJ");
        System.out.println(sb);

        String str =sb.toString();//Converting String buffer to String.

        System.out.println("Converted to String-->"+str);
    }
}
