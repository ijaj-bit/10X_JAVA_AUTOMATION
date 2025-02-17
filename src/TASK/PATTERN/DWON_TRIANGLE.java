package TASK.PATTERN;
//https://www.youtube.com/watch?v=yywT3LDb2d0&list=PLRhowdcybcBwtvahqgd3mZC6Enjm7Z0yi&index=8==YOUTUBE<<<<
public class DWON_TRIANGLE {
    int row=4;

    public static void main(String[] args) {
        for (int i = 4; i>=0 ; i--) {
            for (int j = 0; j<=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
