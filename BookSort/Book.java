package BookSort;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String book;
    private int NumberOfPages;
    private String name;
    private int releaseDate;

    public Book(String book, int numberOfPages, String name, int releaseDate) {
        this.book = book;
        NumberOfPages = numberOfPages;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBook().compareTo(o.getBook());
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }



}
