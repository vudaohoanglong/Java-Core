package BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream {
    public static void main(String[] args) throws Exception {
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            java.io.BufferedOutputStream bout = new java.io.BufferedOutputStream(fout);
            String temp = "Welcome to Java";
            bout.write(temp.getBytes());
            bout.flush();
            fout.close();
        } catch (Exception e){
            throw e;
        }
    }
}
