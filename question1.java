import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the area of the circle: ");
        double area = sc.nextDouble();
        
        double radius = Math.sqrt(area / Math.PI);

        
        double circumference = 2 * Math.PI * radius;

        
        System.out.println("Circumference of the circle: " + circumference);

        sc.close();
    }
}
