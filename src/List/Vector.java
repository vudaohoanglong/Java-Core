package List;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<String> vector = new java.util.Vector<>();
        vector.add("Hi");
        vector.add("Hello");
        vector.add("Bye");
        System.out.println(vector.elementAt(2));
        vector.insertElementAt("Good night",2);
        System.out.println(vector);
        vector.removeElementAt(0);
        System.out.println(vector);
        vector.setElementAt("Good morning",2);
        System.out.println(vector);
    }
}
