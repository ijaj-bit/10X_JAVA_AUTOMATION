package STRING.TASK;

public class String_Immutable {

    public static void main(String[] args) {
        String s = "HELLO";
        s.concat("World");// doesnt Modify 's' creates new objects
        System.out.println(s);// "Hello"(unchanged)

        s=s.concat("World");//Explicite reassignment
        System.out.println(s);//"Hello World"
    }
}
