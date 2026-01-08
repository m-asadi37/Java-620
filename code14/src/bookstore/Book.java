package bookstore;

public class Book {

    String title;
    String author;
    int year;
    boolean isAvailable;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        isAvailable = true;
    }

    void info() {
        System.out.printf("Title: %s Author: %s Year: %d Available: %s%n",
                title, author, year, isAvailable);
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("this book is for you!");
        } else {
            System.out.println("this book is not here!");
        }
    }

    void returnBook() {
        if (isAvailable) {
            System.out.println("we have this book in store!");
        } else {
            isAvailable = true;
            System.out.println("this book is ready for booking!");
        }
    }

}
