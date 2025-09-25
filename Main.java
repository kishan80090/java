  class Test {
    String name, address;

    public Test(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "name= " + name + ", address= " + address;
    }
}
class Ad extends Test {
    int age;

    public Ad(String name, String address, int age) {
        super(name, address);
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + ", age= " + age;
    }
}
public class Main {
    public static void main(String[] args) {
        Test t1 = new Test("Prince", "Bhadohi");
        System.out.println(t1);

        Ad a1 = new Ad("Aman", "Varanasi", 50);
        System.out.println(a1);
    }
}
