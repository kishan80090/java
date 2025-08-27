import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();
        System.out.print("Enter value of C: ");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Roots are imaginary (no real roots).");
        }
    }
}
