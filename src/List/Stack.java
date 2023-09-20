package List;

import java.util.Iterator;
import java.util.ListIterator;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> intStack = new java.util.Stack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.pop();
        Iterator<Integer> it = intStack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        ListIterator<Integer> listIterator = intStack.listIterator();

    }
}