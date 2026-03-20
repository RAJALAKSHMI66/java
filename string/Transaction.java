//3
//        ANU JON 200 1000
//        ANU JON 200 1050
//        RAM SAM 300 2000

package string;

import java.util.*;

import java.util.*;

public class Transaction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] sender = new String[n];
        String[] receiver = new String[n];
        double[] amount = new double[n];
        int[] time = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            sender[i] = sc.next();
            receiver[i] = sc.next();
            amount[i] = sc.nextDouble();
            time[i] = sc.nextInt();
        }

        // Brute force comparison
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (sender[i].equals(sender[j]) &&
                        receiver[i].equals(receiver[j]) &&
                        amount[i] == amount[j] &&
                        Math.abs(time[i] - time[j]) <= 60) {

                    System.out.println("Fraud:");
                    System.out.println(sender[i] + " " + receiver[i] + " " + amount[i] + " " + time[i]);
                    System.out.println(sender[j] + " " + receiver[j] + " " + amount[j] + " " + time[j]);
                }
            }
        }

        sc.close();
    }
}