import java.util.*;
public class dsa {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the A number : ");
    int a=sc.nextInt();
    System.out.println("A"+a);
    System.out.println("Enter the B number : ");
    int b=sc.nextInt();
    // binary code
    a=a^b;
    b=a^b;
    a=a^b;
    // without variable ka
    a=a+b;
    b=a-b;
    a=a-b;
    // third variable 
    int t=a;
    b=a;
    a=t;
    // System.out.println("A"+","+a);
    // System.out.println("b"+","+b);
    
}
}