package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //GIVEN
        //creating books
        Book book1 = new Book( "title1", "author1", LocalDate.of(2001, 01, 01));
        Book book2 = new Book( "title2", "author2", LocalDate.of(2001, 01, 02));
        Book book3 = new Book( "title3", "author3", LocalDate.of(2001, 01, 03));
        Book book4 = new Book( "title4", "author4", LocalDate.of(2001, 01, 04));

        //creating library and adding books to it
        Library library = new Library("Test Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow copy of the library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("shallow-cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of the library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deep-cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //WHEN
        library.getBooks().remove(book4);

        //THEN
        assertEquals(3, library.getBooks().size());
        assertEquals(3, shallowClonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}
