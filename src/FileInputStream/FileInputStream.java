package FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream {
    private static void example() { // read one char
        try {
            java.io.FileInputStream fin = new java.io.FileInputStream("test.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private static void example2() { // read all char
        try {
            java.io.FileInputStream fin = new java.io.FileInputStream("test.txt");
            int i;
            while ((i=fin.read())!=-1) {
                System.out.println((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        example();
        example2();
    }
}
