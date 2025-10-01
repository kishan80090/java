public class youtest1 extends youtest {
    String address;
    public youtest1(String Name,String age,String mobile,String address){
        super(Name, age, mobile);
        this.address=address;
    }
    public String toString(){
        return super.toString() +"name : "+name+",age : "+age+",mobile : "+mobile+",address : "+address;
    }
    public static void main(String[] args) {
        youtest1 y1=new youtest1("mukesh", "19", "9545817200", "Varanasi");
        System.out.println(y1);
    }
}
