package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<String> books;

    // Constructor: create an empty list of books
    public Library() {
        books = new ArrayList<String>();
    }

    // Add a book at the end
    public void addBook(String title) {
        if (!books.contains(title)) {   // prevent duplicates
            books.add(title);
            Collections.sort(books); // keep list sorted alphabetically
        }
    }

    // Get the full list of books
    public ArrayList<String> getBookList() {
        return new ArrayList<>(books); // return a copy
    }

    // Get a book at a specific position
    public String getBookByPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        return null; // return null if position is invalid
    }

    // Add a book at a specific position
    public void addBookByPosition(String title, int position) {
        if (position >= 0 && position < books.size() && books.contains(title)) {
            books.add(position, title);
            Collections.sort(books);
        }
    }

    // Remove a book by title
    public boolean removeBook(String title) {
        return (books.remove(title));
    }
}


