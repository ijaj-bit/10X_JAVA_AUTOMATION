package EXCEPTION;

public class Exception_4 {
    public static void main(String[] args) {
        System.out.println("Start");

        String s = null;

        try {
            s.trim();
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }

        System.out.println("END");


    }
}
