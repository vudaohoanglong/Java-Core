package List;

import java.util.List;
import java.util.ListIterator;

public class ArrayList {
    public static void  main(String[] args) {
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        arrayList.ensureCapacity(5); // ensureCapacity methods;
        arrayList.add("Hello");
        arrayList.add("Hi");
        arrayList.add("Bye");
        ListIterator<String> iterator = arrayList.listIterator(3); // listIterator
        while (iterator.hasPrevious()) { // hasPrevious
            System.out.println(iterator.previousIndex()+" "+iterator.previous()); // previousIndex and previous method
        }
        arrayList.trimToSize(); // trimToSize methods
    }
}
