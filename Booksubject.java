class Book {  
    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }

    public void display() {
        System.out.println("Book Name : " + bookname + "  Subject : " + subject + "  Price : " + price);
    }
}

public class Booksubject {
    public static void main(String[] args) {
        Book b1 = new Book("Basic C++", "C++", 150);
        b1.display();
    }
}
