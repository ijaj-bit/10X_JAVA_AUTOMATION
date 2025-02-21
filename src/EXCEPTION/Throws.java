package EXCEPTION;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("C://abc.txt");

    }
}
