package PrintWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class PrintWriter {
    private static void example() {
        // using console out stream
        java.io.PrintWriter printWriter = new java.io.PrintWriter(System.out);
        printWriter.write("Hello");
        printWriter.flush();
        printWriter.close();
    }
    private static void example2() throws FileNotFoundException {
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new FileOutputStream("test.txt"));
        printWriter.write("Hello World");
        printWriter.flush();
        printWriter.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        example2();
    }
}

