package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author 1", "Title 1", 2003, "0001");
        Book book2 = new Book("Author 2", "Title 2", 2012, "0002");
        Book book3 = new Book("Author 3", "Title 3", 2001, "0003");
        Book book4 = new Book("Author 4", "Title 4", 2015, "0004");
        Book book5 = new Book("Author 5", "Title 5", 2007, "0005");
        Book book6 = new Book("Author 6", "Title 6", 2007, "0006");
        Book book7 = new Book("Author 7", "Title 7", 2009, "0007");

        Set<Book> bookSet = new HashSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);

        MedianAdapter adapter = new MedianAdapter();

        //Then
        int medianaOfYear = adapter.publicationYearMedian(bookSet);

        //When
        System.out.println(medianaOfYear);
        assertEquals(2007, medianaOfYear);
    }
}