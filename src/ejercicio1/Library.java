package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


public class Library {
    private List<Book> books = new ArrayList<>();

    // Constructor: create an empty list of books
    public Library() {
        books = new ArrayList<Book>();
    }

    // Add a book at the end
    public void addBook(String title, String author) {
        for (Book b : books) {
            if (b.getTitle().equals(title))
                return;
        }
        books.add(new Book(title, author));
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });
    }

    // Get the full list of books
    public ArrayList<String> getBookList() {
        ArrayList<String> list = new ArrayList<>();
        for (Book b : books) {
            list.add(b.getTitle());
        }
        return list; // return a copy
    }

    // Get a book at a specific position
    public String getBookByPosition(int position) {
        if (position >= 0 && position <= books.size()) {
            return books.get(position).getTitle();
        }
        return null;
    }

    // Remove a book by title
    public boolean removeBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }
}


