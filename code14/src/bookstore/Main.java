package bookstore;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("aa", "aaa", 1980);

        b1.info();
        b1.borrowBook();
        b1.returnBook();
        b1.returnBook();
        b1.borrowBook();
        b1.borrowBook();
    }
}
