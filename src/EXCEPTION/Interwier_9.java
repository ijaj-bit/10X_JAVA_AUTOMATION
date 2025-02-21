package EXCEPTION;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Interwier_9 {

    public static void main(String[] args) {
        try {
            FileReader  f = new FileReader("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
