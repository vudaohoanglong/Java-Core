package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("test.txt");
            file.read();
        } catch (java.io.IOException e) {
            System.out.println("have an IOException");
        }
    }
}
