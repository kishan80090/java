import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    String title;
    String author;
    boolean isIssued;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Issued: " + isIssued;
    }
}
public class LibraryManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static final String FILE_NAME = "books.dat";

    public static void main(String[] args) {
        loadBooks();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Library Menu ---");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. Issue Book");
                System.out.println("4. Return Book");
                System.out.println("5. View All Books");
                System.out.println("6. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> addBook(sc);
                    case 2 -> removeBook(sc);
                    case 3 -> issueBook(sc);
                    case 4 -> returnBook(sc);
                    case 5 -> viewBooks();
                    case 6 -> {
                        saveBooks();
                        System.out.println("Exiting...");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid option!");
                }
            }
        }
    }
    public static void addBook(Scanner sc) {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }
    public static void removeBook(Scanner sc) {
        System.out.print("Enter book title to remove: ");
        String title = sc.nextLine();
        books.removeIf(b -> b.title.equalsIgnoreCase(title));
        System.out.println("Book removed successfully (if existed)!");
    }
    public static void issueBook(Scanner sc) {
        System.out.print("Enter book title to issue: ");
        String title = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
    public static void returnBook(Scanner sc) {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            System.out.println("\n--- Books in Library ---");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void loadBooks() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            books = (ArrayList<Book>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            books = new ArrayList<>();
        }
    }
    public static void saveBooks() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }
}
