package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryRemoveBookTest {

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("Harry Potter");
        library.addBook("The Lord of the Rings");
        assertTrue(library.removeBook("Harry Potter"));
        assertFalse(library.getBookList().contains("Harry Potter"));
        assertEquals(1, library.getBookList().size());
    }

    @Test
    public void testRemoveNonExistentBook() {
        Library library = new Library();
        library.addBook("Book A");
        assertFalse(library.removeBook("Book B"));
        assertEquals(1, library.getBookList().size());
    }
}