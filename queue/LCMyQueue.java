package queue;

//Implement Queue using Stacks
//Input
//        ["MyQueue", "push", "push", "peek", "pop", "empty"]
//        [[], [1], [2], [], [], []]
//        Output
//        [null, null, null, 1, 1, false]

import java.util.Stack;

public class LCMyQueue {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public LCMyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        moveIfNeeded();
        return outStack.pop();
    }

    public int peek() {
        moveIfNeeded();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void moveIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    //  Main method to simulate given input
    public static void main(String[] args) {

        LCMyQueue myQueue = new LCMyQueue();

        System.out.println("push(1)");
        myQueue.push(1);

        System.out.println("push(2)");
        myQueue.push(2);

        System.out.println("peek(): " + myQueue.peek());   // Expected 1
        System.out.println("pop(): " + myQueue.pop());     // Expected 1
        System.out.println("empty(): " + myQueue.empty()); // Expected false
    }
}
