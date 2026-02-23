package queue;

//Implement Stack using Queues
//        Input
//        ["MyStack", "push", "push", "top", "pop", "empty"]
//        [[], [1], [2], [], [], []]
//        Output
//        [null, null, null, 2, 2, false]

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        // Step 1: Add new element to q2
        q2.offer(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    //  Main method to simulate given input
    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        System.out.println("push(1)");
        myStack.push(1);

        System.out.println("push(2)");
        myStack.push(2);

        System.out.println("top(): " + myStack.top());   // Expected 2
        System.out.println("pop(): " + myStack.pop());   // Expected 2
        System.out.println("empty(): " + myStack.empty()); // Expected false
    }
}
