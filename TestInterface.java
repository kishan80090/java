interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones");
    }
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}


public class TestInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}
