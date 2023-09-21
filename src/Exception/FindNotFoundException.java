package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindNotFoundException {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.dat");
            int ch;
            while ((ch=fileInputStream.read())!=-1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
