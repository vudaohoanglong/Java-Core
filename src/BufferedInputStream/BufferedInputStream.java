package BufferedInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            java.io.BufferedInputStream bin = new java.io.BufferedInputStream(fin);
            int i;
            while ((i=bin.read())!=-1) {
                System.out.println((char)i);
            }
            bin.close();
            fin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
