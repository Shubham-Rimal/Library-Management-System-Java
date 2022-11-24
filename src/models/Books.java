package models;

public class Books {
    String bookName;
    String author;
    int isbn;
    int publishedYear;
    int bookId;

    public int getBookDetails() {
        System.out.println("Name: "+this.bookName+"\nAuthor: "+this.author+"\nISBN: "+this.isbn+"\nPublished Year: "+this.publishedYear+"\n\n");
        return bookDetails;
    }

    public void setBookDetails(int bookDetails) {
        this.bookDetails = bookDetails;
    }

    int bookDetails;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Books(String bookName, String author, int isbn, int publishedYear, int bookId) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.bookId = bookId;
        this.bookDetails = bookDetails;
    }
}
