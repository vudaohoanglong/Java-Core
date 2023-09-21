package Interface.Serializable;

import java.io.Serializable;

public class Student implements Serializable {
    private final int id;
    private final String name;

    Student(int id,String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

