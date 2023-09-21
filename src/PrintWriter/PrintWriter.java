package PrintWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class PrintWriter {
    private static void example() {
        // using console out stream
        java.io.PrintWriter printWriter = new java.io.PrintWriter(System.out);
        List<String> list = new ArrayList<>();
        list.add("Hello");
        printWriter.println(list);
        printWriter.flush();
        printWriter.close();
    }
    private static void example2() throws FileNotFoundException {
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new FileOutputStream("test.txt"));
        List<String> list = new ArrayList<>();
        list.add("Hello");
        printWriter.print(list);
        printWriter.flush();
        printWriter.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        example2();
    }
}

