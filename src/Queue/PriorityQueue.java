package Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<Integer>();
        priorityQueue.add(1);
        priorityQueue.add(1);
        priorityQueue.removeIf((e)->{
            return e == 1;
        });
        System.out.println(priorityQueue);
    }
}
