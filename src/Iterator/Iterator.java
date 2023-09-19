package Iterator;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("String");
        list.add("Integer");
        list.add("Float");
        java.util.Iterator iterator = list.iterator(); // iterator
         while (iterator.hasNext()) { // boolean to check if there still element left
            System.out.println(iterator.next()); // get the value and iterate
        }
    }
}
