package TASK;

import java.util.Arrays;

public class Sort_Array_without_Function {
    public static void main(String[] args) {
        int[] n = {12, 34, 10, 1, 100, 3, 4, 32};

        for (int i = 0; i <n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(n));
    }
}
