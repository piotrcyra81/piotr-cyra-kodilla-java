package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {

    String name;
    Set<Book> books = new HashSet<>();


    public Library(final String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Set<Book> getBooks() {
        return books;
    }
    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {

        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();

        for (Book book: books) {
            Book newbook = new Book(book.getTitle(),book.getAuthor(),book.getPublicationDate());
            cloneLibrary.getBooks().add(newbook);
        }
        return cloneLibrary;
    }
}