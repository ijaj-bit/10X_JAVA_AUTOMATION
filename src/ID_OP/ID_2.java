package ID_OP;

public class ID_2 {
    public static void main(String[] args) {
        String string_age = args[0];
        // 99 100 101 56
        int age= Integer.parseInt(string_age);

        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        String result = age >= 24 ? "YES":"NO";
        System.out.println(result);
    }
}
