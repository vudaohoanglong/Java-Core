package Interface.DataStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream {
    public static void main(String[] args) throws IOException {
        java.io.DataOutputStream data = new java.io.DataOutputStream(
                new FileOutputStream("src/Interface/DataStream/test.txt")
        );
        data.writeInt(15);
        data.writeUTF("Hello world");
        data.flush();
        data.close();
    }
}
