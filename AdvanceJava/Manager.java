package AdvanceJava;
public class Manager extends Employee {
    String department;
Employee secretary;
    public Manager(String name, String address, String mobile, int age, int salary, String post,String deparment,Employee secretary) {
        super(name, address, mobile, age, post, salary);
        this.department=deparment;
        this.secretary=secretary;
    }
    @Override
    public String toString() {
        return super.toString() + "Department = " + department + ", Secretary [" +secretary+"]";
    }
    public double salaryWithDA() {
        return (115.0 * salary) / 100;
    }
       public static void main(String[] args) {
        Employee secretary=new Employee("raman", "varanasi", "955965444", 52, "peon", 9000);
        Manager m1=new Manager("mahesh", "varansi", "95864852", 20, 6000, "manager", "it", secretary);
        System.out.println(m1);
}
}