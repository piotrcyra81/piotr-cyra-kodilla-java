package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test public void testGetBooks() {

        //Given
        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(2017, 10, 10));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(2010, 5, 5));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(2001, 1, 1));

        Library library = new Library("Project number 1");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library libraryCloned = null;

        try {
            libraryCloned = library.shallowCopy();
            libraryCloned.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library libraryClonedDeep = null;

        try {
            libraryClonedDeep = library.deepCopy();
            libraryClonedDeep.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When

        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(libraryCloned);
        System.out.println(libraryClonedDeep);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, libraryCloned.getBooks().size());
        Assert.assertEquals(3, libraryClonedDeep.getBooks().size());
        Assert.assertEquals(library.getBooks(), libraryCloned.getBooks());
        Assert.assertNotEquals(library.getBooks(), libraryClonedDeep.getBooks());
    }
}