package ejercicio1;
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
        library.addBook("Harry Potter");
        library.addBook("The Lord of the Rings");
        library.addBook("The Alchemist");
        assertEquals("Harry Potter", library.getBookByPosition(0));
        assertEquals("The Lord of the Rings", library.getBookByPosition(2));
        assertNull(library.getBookByPosition(10));
    }

    @Test
    public void testGetSortedBookList() {
        Library library = new Library();
        library.addBook("C Book");
        library.addBook("A Book");
        library.addBook("B Book");
        ArrayList<String> books = library.getBookList();
        assertEquals("A Book", books.get(0));
        assertEquals("B Book", books.get(1));
        assertEquals("C Book", books.get(2));
    }
}
