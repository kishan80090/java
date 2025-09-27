package pack1;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.packageVar); 
        // System.out.println(a.privateVar);
        System.out.println(a.protectedVar);
        System.out.println(a.publicVar);    
    }
}
