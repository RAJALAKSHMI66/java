package queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Deque;

public class to_create {

    public static void main(String[] args) {
        //Array Queue
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.poll();   // removes 1
        queue.peek();   // returns 2
        queue.add(10);   // enqueue
        queue.add(20);
        queue.add(30);

        System.out.println(queue.poll()); // removes & returns 10
        System.out.println(queue.peek()); // returns 20 (does not remove)
        System.out.println(queue);         // [20, 30]
        //priority queue

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        //linked list
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.remove();

        //Priority Queue (Not FIFO)
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(30);
        q1.add(10);
        q1.add(20);

        //Deque (Double-Ended Queue)
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.removeFirst();
        dq.removeLast();


    }
}

//| Method      | What it does                               |
//        | ----------- | ------------------------------------------ |
//        | `add(e)`    | Insert element (throws exception if fails) |
//        | `offer(e)`  | Insert element (returns false if fails)    |
//        | `poll()`    | Remove & return head (null if empty)       |
//        | `remove()`  | Remove & return head (exception if empty)  |
//        | `peek()`    | View head (null if empty)                  |
//        | `element()` | View head (exception if empty)             |

//add(e) / offer(e)   // insert
//remove() / poll()  // delete
//element() / peek() // view head
//isEmpty()
//size()
