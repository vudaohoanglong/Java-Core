package FileOutputStream;

public class FileOutputStream {
    public static void main(String[] args) {
        try {
            java.io.FileOutputStream _out = new java.io.FileOutputStream("test.txt");
            _out.write(69); // write a byte
            String temp = "Hello";
            _out.write(temp.getBytes()); // write a byte array
            _out.write(temp.getBytes(),0,2); //write a byte subarray
            _out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}