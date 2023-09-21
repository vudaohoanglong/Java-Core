package Interface.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("src/Interface/Serializable/test.txt")
            );
            Student student = (Student) in.readObject();
            System.out.println(student.getName() + " " +student.getId());
            in.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
