import java.util.Scanner;
public class Rectanglesingle {
    int breadth;
    int length;
public Rectanglesingle()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the breadth : ");
    breadth =sc.nextInt();
        System.out.println("Enter the length : ");
        length =sc.nextInt();
}
    public Rectanglesingle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }
    public int area() {
        return length * breadth;
    }
    public int perimeter() {
        return 2 * length + 2 * breadth;
    }
    public String toString() {
        return "breadth= " + breadth + ",length = " + length;
    }
    public static void main(String[] args) {
        Rectanglesingle r1 = new Rectanglesingle();
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
