package List;

import java.util.Iterator;

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

    }
}