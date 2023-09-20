package List;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class List {
    public static void main(String[] args) {
        java.util.List<String> list = new ArrayList<>();
        java.util.List<String> anotherList = new ArrayList<>();
        anotherList.add("Hi");
        list.add(0,"Hello"); // method add(index,element)
        list.addAll(0,anotherList); // addAll(index,element) method
        int temp = list.indexOf("Hi");
        temp = list.lastIndexOf("Hello");
        list.remove(0); // remove(index) method
        list.add("Bye");
        list.replaceAll(e-> {
            if (Objects.equals(e, "Bye")) return "hello";
            return e;
        }); // replaceAll method
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(list.subList(0,1)); // sublist methods
    }
}
