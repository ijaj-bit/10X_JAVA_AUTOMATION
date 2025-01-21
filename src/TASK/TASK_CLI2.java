package TASK;

public class TASK_CLI2 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String result = a>b ? "A is large Number":"B is large Number";
        System.out.println(result);
    }
}
