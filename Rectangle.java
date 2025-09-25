public class Rectangle {

    int l, b;
    public Rectangle() {
        System.err.println("zero parameter constructor in Rectangle");
        l = 0;
        b = 0;
    }

    public Rectangle(int x) {
        System.out.println("one parameter constructor in Rectangle");
        l = x;
        b = x;
    }
    
    public Rectangle(int x, int y) {
        System.out.println("two parameter constructor in Rectangle");
        l = x;
        b = y;
    }
    
    public String toString() {
        return "Rectangle: l = " + l + ", b = " + b;
    }
}
