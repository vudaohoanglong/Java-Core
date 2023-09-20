package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        java.util.HashSet<String> hashSet = new java.util.HashSet<>(collection);
        hashSet.add("Hi");
        System.out.println(hashSet.contains("Bye"));;
        System.out.println(hashSet);
        System.out.println(hashSet.remove("Hello"));
        System.out.println(hashSet);
    }
}