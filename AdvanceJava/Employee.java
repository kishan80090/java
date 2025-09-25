package AdvanceJava;
public class Employee extends Person {
    String post;
    int salary;
    public Employee(String name, String address, String mobile, int age, String post, int salary) {
        super(name, address, mobile, age);
        this.post =post;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + ", post = " + post + ", Salary = " + salary + "\n";
    }
}