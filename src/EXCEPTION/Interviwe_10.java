package EXCEPTION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Interviwe_10 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("NOTHIF");
        }

    }
}
