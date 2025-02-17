package TASK.PATTERN;

public class LEFT_TRIANGLE {
    public static void main(String[] args) {
        int row=4;
        for (int i = 0; i <=4 ; i++) {//row(i)loop
            for (int k=3;k>=i;k--)//space loop
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {//Column(j)loop
                System.out.print("*");

            }
            System.out.println();//new line

        }
    }
}
