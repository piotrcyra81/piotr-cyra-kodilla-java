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
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book: books) {
            cloneLibrary.getBooks().add(book);
        }
        return cloneLibrary;
    }
}