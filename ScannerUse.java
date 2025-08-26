import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = s.nextInt(), b = s.nextInt();
        int sum = a + b;
        System.out.printf("Sum=%d", sum);

    }
}
