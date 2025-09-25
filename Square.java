public class Square extends Rectangle {

    public Square() {
        super(); 
    }
    public Square(int n) {
        super(n); 
    }
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square(3);
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
