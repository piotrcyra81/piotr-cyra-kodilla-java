package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void createLibrary() {

        Library library = new Library("myLibrary");
        Book book1 = new Book("title1", "author1", LocalDate.of(2000, 1, 1));
        library.getBooks().add(book1);
        Book book2 = new Book("title2", "author2", LocalDate.of(2000, 2, 2));
        library.getBooks().add(book2);
        Book book3 = new Book("title3", "author3", LocalDate.of(2000, 3, 3));
        library.getBooks().add(book3);
        Book book4 = new Book("title4", "author4", LocalDate.of(2000, 4, 4));
        library.getBooks().add(book4);
        Book book5 = new Book("title5", "author5", LocalDate.of(2000, 5, 5));
        library.getBooks().add(book5);

        Library clonedLibrary = null;

        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("newLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("oldLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);
        library.getBooks().remove(book2);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}