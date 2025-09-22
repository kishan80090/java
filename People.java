public class People {
    String name,address,mobile,pin_code;
    public People(String name,String address,String mobile,String pin_cod){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
        this.pin_code=pin_cod;
    }
    public String toString(){
        return "name="+ name +",address="+ address +",mobile="+ mobile +",pic_code="+pin_code;
    }
    public static void main(String[] args) {
        People p1=new People("Ramesh", "Varanasi", "9559785600", "221002");
        System.out.println(p1);
    }
    
}
