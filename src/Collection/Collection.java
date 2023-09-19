package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Collection {
    public static void main(String[] args) {
        java.util.Collection<String> collection = new ArrayList<>();
        collection.add("Hello"); // add method
        collection.add("Hello");
        java.util.Collection<String> newCollection = new ArrayList<>();
        newCollection.addAll(collection); // addAll method
        newCollection.remove("Hello"); // remove method
        newCollection.removeAll(collection); //removeAll method
        newCollection.removeIf((e)-> Objects.equals(e, "Hello")); // removeIf method
        newCollection.retainAll(collection); // retainAll method
        int NUMBER_OF_SIZE = newCollection.size(); // size method
        newCollection.clear(); // clear method
        newCollection.contains("Hello"); // contains method
        newCollection.add("Hello");
        System.out.println(collection);
        if (newCollection.containsAll(collection)) System.out.println("Yes"); //containsAll method
        Iterator<String> iterator = newCollection.iterator(); // iterator method
        Object[] arr = newCollection.toArray(); // toArray method
        newCollection.isEmpty(); //
        newCollection.equals(collection);
        System.out.println(arr[0]);
        System.out.println(newCollection.hashCode());
    }
}