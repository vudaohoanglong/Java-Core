package Set;

import java.util.Collection;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("Hello");
        linkedHashSet.add("Hello");
        Collection<String> collection = (Collection<String>) linkedHashSet.clone();
        System.out.println(collection);
    }
}
