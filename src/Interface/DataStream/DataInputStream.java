package Interface.DataStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStream {
    public static void main(String[] args) throws IOException {
        java.io.DataInputStream in = new java.io.DataInputStream(
                new FileInputStream("src/Interface/DataStream/test.txt")
        );
        System.out.println(in.readInt());
        System.out.println(in.readUTF());
    }
}
