package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StudentsSandwich {

    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studentQueue = new LinkedList<>();
        Stack<Integer> sandwichStack = new Stack<>();

        // Add students to queue
        for (int i = 0; i < students.length; i++) {
            studentQueue.offer(students[i]);
        }

        // Add sandwiches to stack (reverse order)
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichStack.push(sandwiches[i]);
        }

        int rotations = 0;

        while (!studentQueue.isEmpty() && rotations < studentQueue.size()) {

            if (studentQueue.peek().equals(sandwichStack.peek())) {
                studentQueue.poll();
                sandwichStack.pop();
                rotations = 0;
            } else {
                studentQueue.offer(studentQueue.poll());
                rotations++;
            }
        }

        return studentQueue.size();
    }

    //  Main Method
    public static void main(String[] args) {

        StudentsSandwich sol = new StudentsSandwich();

        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};

        int result = sol.countStudents(students, sandwiches);

        System.out.println("Number of students unable to eat: " + result);
    }
}
