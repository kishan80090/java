import java.util.Scanner;
public class areatrengle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three number : a , b , c");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double s=(a+b+c)/(double)2;
        System.out.println("S = "+s);
        float area =(float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area = "+area);
    }
}