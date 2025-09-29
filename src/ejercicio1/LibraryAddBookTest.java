package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class LibraryAddBookTest {

        @Test
        public void testAddBookSize() {
            Library library = new Library();
            library.addBook("Harry Potter");
            library.addBook("The Lord of the Rings");
            library.addBook("The Alchemist");
            library.addBook("The Godfather");
            library.addBook("The Da Vinci Code");
            assertEquals(5, library.getBookList().size());
        }

        @Test
        public void testNoDuplicateBook() {
            Library library = new Library();
            library.addBook("Harry Potter");
            library.addBook("Harry Potter");
            assertEquals(1, library.getBookList().size());
        }

        @Test
        public void testAddBookByPosition() {
            Library library = new Library();
            library.addBook("Book A");
            library.addBook("Book B");
            library.addBookByPosition("Book C", 1);
            assertTrue(library.getBookList().contains("Book C"));
            assertEquals(3, library.getBookList().size());
        }
    }

