import java.util.Scanner;


public class circulradius {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  radius : ");
        int r=sc.nextInt();
        double area = (3.14159 *r*r);
        System.out.println("Area = "+area);
    }
}