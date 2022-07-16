package BookSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        books[0] = new Book("Ulysses ", 85, "James Joyce", 1998);
        books[1] = new Book("Lolita ", 120, "Vladimir Nabokov", 2001);
        books[2] = new Book("Middlemarch ", 58, "George Eliot", 2005);
        books[3] = new Book("Emma  ", 117, "Jane Austen", 1996);
        books[4] = new Book("War And peace ", 153, "Lev Tolstoy", 2007);

        Set<Book> setBook = new TreeSet<>();

        Collections.addAll(setBook, books);

        for (Book value : setBook) {
            System.out.println(value.getBook());
        }

        Set<Book> setPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPages() - o2.getNumberOfPages();
            }
        });

        Collections.addAll(setPage,books);

        for (Book value : setPage){
            System.out.println(value.getNumberOfPages());
        }
    }
}
