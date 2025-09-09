public class Book {
    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }

    @Override
    public String toString() {
        return "Book Name : " + bookname + "  Subject : " + subject + "  Price : " + price;
    }
    public static void main(String[] args) {
        Book b1 = new Book("Basic C++", "C++", 150);
        Book b2 = new Book("Advanced Java", "Java", 789);
        System.out.println(b1);
        System.out.println(b2);
    }
}
