package AdvanceJava;

public class Person {
    String name, address, mobile;
    int age;

    public Person(String name, String address, String mobile, int age) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.age = age;
    }
    public String toString() {
        return "Name=" + name + ", address=" + address + ", age=" + age + ", mobile=" + mobile;
    }
    public static void main(String[] args) {
        System.out.println("Persons:");
        Person p1 = new Person("Roshan", "Varanasi", "9559717200", 19);
        System.out.println(p1);
    }
}
