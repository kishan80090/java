class Book {
    String bookname, subject;
    int price;

    public Book(String bookname, String subject, int price) {
        this.bookname = bookname;
        this.subject = subject;
        this.price = price;
    }
    public void display() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Subject: " + subject);
        System.out.println("Price: " + price);
    }
}
public class oop {
    public static void main(String[] args) {
        
        Book b1 = new Book("Basic C++", "C++", 199);
        Book b2=new Book( "Basic Java", "Java", 599);

        b1.display();
        b2.display();
    }
}
