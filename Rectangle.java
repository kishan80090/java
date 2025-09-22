import java.util.Scanner;
public class Rectangle {
    int breadth;
    int length;
public Rectangle()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the breadth : ");
    breadth =sc.nextInt();
        System.out.println("Enter the length : ");
        length =sc.nextInt();
}
    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
        System.out.printf("2 parameter constructor");
    }
    public Rectangle(int side)
    {
        // this.length=side;
        // this.breadth=side;
        this(side,side);
        System.out.printf("1 parameter constructor");
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
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
