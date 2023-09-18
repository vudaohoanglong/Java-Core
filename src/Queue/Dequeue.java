package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.addFirst(15);
        deque.addLast(16);
        deque.addFirst(1);
        System.out.println(deque);
    }
}
