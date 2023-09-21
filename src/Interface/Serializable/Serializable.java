package Interface.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("src/Interface/Serializable/test.txt")
            );
            out.writeObject(new Student(1,"Long"));
            out.flush();
            out.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
