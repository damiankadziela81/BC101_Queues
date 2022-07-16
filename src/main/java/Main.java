import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        // *****************************************************

        // Queue = FIFO data structure. First-In First-Out
        //		   A collection designed for holding elements prior to processing
        //		   Linear data structure

        //         enqueue = offer()
        //         dequeue = poll()

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // *****************************************************

        //Queue is an interface, there are 2 classes that implements queues - LinkedList and PriorityQueue
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //methods inherited from Collection interface
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Karen"));

        System.out.println(queue.peek());

        System.out.println(queue);

        //poll method will not throw exception when the queue is empty and use pull
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

    }
}
