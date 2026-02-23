package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add new request
        queue.offer(t);

        // Remove requests older than t - 3000
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // Return number of recent calls
        return queue.size();
    }

    public static void main(String[] args) {

        RecentCounter recentCounter = new RecentCounter();

        System.out.println("ping(1): " + recentCounter.ping(1));       // 1
        System.out.println("ping(100): " + recentCounter.ping(100));   // 2
        System.out.println("ping(3001): " + recentCounter.ping(3001)); // 3
        System.out.println("ping(3002): " + recentCounter.ping(3002)); // 3
    }
}
