public class youtest1 extends youtest {
    String pincode;
    public youtest1(String name,String address,String mobile,String pincode){
        super(name,address,mobile);
        this.pincode=pincode;
    }
    public String toString(){
        return super.toString()+",pincode= "+pincode;
    }
    public static void main(String[] args) {
    youtest1 y1=new youtest1("kishan", "varanasi", "9559717200", "221001");
    System.out.println(y1);
}
}