public class youtest {

    String bookname;
    String subject;
    int price;
    
    public youtest(String b,String s,int p){

        bookname=b;
        subject=s;
        price=p;
    }
    public void display(){
        System.out.println("Book Name : "+bookname);
        System.out.println("Subject : "+subject);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        youtest you=new youtest("Basic Python", "Python", 999);
        you.display();
        
    }
}