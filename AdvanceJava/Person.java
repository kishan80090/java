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
        return "Name = " + name + ", Address = " + address + ", Age = " + age + ", Mobile = " + mobile;
    }
 
    }

