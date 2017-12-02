package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, NewBook> books);
    int medianPublicationYear(Map<BookSignature, NewBook> books);
}
