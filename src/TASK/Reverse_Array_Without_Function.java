package TASK;

import java.util.Arrays;

public class Reverse_Array_Without_Function {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[i]<numbers[j])
                {
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }

            }

        }

        System.out.println(Arrays.toString(numbers));
    }
}
