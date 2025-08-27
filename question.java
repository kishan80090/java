import java.util.Scanner;
public class question {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the p : ");
     int p=sc.nextInt();
     System.out.print("Enter the r : ");
     int r=sc.nextInt();
     System.out.print("Enter the t : ");
     int t=sc.nextInt();
     int si=(p*r*t)/100;
     int ci = (int)(p*Math.pow((1+r/100.0),t)-p);
     System.out.println("SI = "+si);
     System.out.println("CI = "+ci);
    }
}
