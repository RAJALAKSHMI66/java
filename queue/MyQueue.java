package queue;

public class MyQueue {
    private int front, rear, size, capacity;
    private int[] array;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = -1;
        array = new int[capacity];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int front() {
        if (isEmpty()) return -1;
        return array[front];
    }

    // Main method moved inside MyQueue
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.front());
    }
}
