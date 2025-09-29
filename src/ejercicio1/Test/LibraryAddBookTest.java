package ejercicio1.Test;

import ejercicio1.Library;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


import static org.junit.jupiter.api.Assertions.*;

    public class LibraryAddBookTest {

        @Test
        public void testAddBookSize() {
            List<String> library = new ArrayList<>();
            library.add("Harry Potter");
            library.add("The Lord of the Rings");
            library.add("The Alchemist");
            library.add("The Godfather");
            library.add("The Da Vinci Code");
            assertEquals(5, library.size());
        }

        @Test
        public void testNoDuplicateBook() {
            Library library = new Library();
              library.addBook("Harry Potter", "J.K. Rowling" );
              library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
              library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
            assertEquals(2, library.getBookList().size());
        }

        @Test
        public void testAddBookByPosition() {
            Library library = new Library();
            library.addBook("Book A", "Author A");
            library.addBook("Book B", "Author B");
            assertEquals("Book A", library.getBookByPosition(0));
            assertTrue(library.getBookList().contains("Book A"));
            assertEquals(2, library.getBookList().size());
        }
    }

