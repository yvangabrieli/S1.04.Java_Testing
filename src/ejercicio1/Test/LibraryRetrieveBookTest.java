package ejercicio1.Test;
import ejercicio1.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryRetrieveBookTest {

    @Test
    public void testGetBookListNotEmpty() {
        Library library = new Library();
        ArrayList<String> books = library.getBookList();
        assertNotNull(books);
    }

    @Test
    public void testGetBookByPosition() {
        Library library = new Library();
        library.addBook("Harry Potter", " J.K. Rowling");
        library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBook("The Alchemist", "Alchim Buraj");
        assertEquals("Harry Potter", library.getBookByPosition(0));
        assertEquals("The Alchemist", library.getBookByPosition(1));
        assertNull(library.getBookByPosition(10));
    }

    @Test
    public void testGetSortedBookList() {
        Library library = new Library();
        library.addBook("C Book", "Author C");
        library.addBook("A Book",  "Author A");
        library.addBook("B Book",   "Author B");
        ArrayList<String> books = library.getBookList();
        assertEquals("A Book", books.get(0));
        assertEquals("B Book", books.get(1));
        assertEquals("C Book", books.get(2));
    }
}
