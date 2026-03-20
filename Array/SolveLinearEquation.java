package Array;

import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.println("Enter a1, b1, c1:");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();

        System.out.println("Enter a2, b2, c2:");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();

        // Determinant
        double determinant = a1 * b2 - b1 * a2;

        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x = (c1 * b2 - b1 * c2) / determinant;
            double y = (a1 * c2 - c1 * a2) / determinant;

            System.out.println("Solution:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        sc.close();
    }
}
