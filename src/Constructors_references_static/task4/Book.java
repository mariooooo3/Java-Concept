package Constructors_references_static.task4;


public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Titlul este:" + title + " \nAutorul este: " + author + " \nAnul este:" + year;
    }
}
