package AdvanceJava;
class A {
    public A() {
        System.out.println("Zero parameter constructor in A");
    }
}
class B extends A {
    public B() {
        System.out.println("Zero parameter constructor in B");
    }
}
public class inheritance {
    public static void main(String[] args) {
        new B();
    }
}
