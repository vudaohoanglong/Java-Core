package File;

import java.io.File;
import java.io.IOException;

public class File_example {
    private static void example() {
        try {
            File f = new File("src/File/file_text.txt");
            if (f.createNewFile()) {
                System.out.println("Created new file");
            }
            else {
                System.out.println("File already existed");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void example2() {
        try {
            File f = new File("src/File/file_text");
            if (f.exists()) {
                System.out.println("File existed");
            }
            f.mkdirs();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void example3() throws IOException {
        File f = new File("src/File/folder/folder_test");
        f.mkdirs();
        System.out.println(f.getParent());
    }
    private static void example4() throws IOException {
        File f = new File ("src/File/folder/folder_test");
        System.out.println(f.delete());
    }
    public static void main(String[] args) throws IOException {
        example3();
    }
}
