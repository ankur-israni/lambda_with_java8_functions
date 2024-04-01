package com.ankur.service;



import com.ankur.domain.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService {
    private Map<Integer, Book> db = new HashMap<>();

    public BookService() {
        db.put(1, new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        db.put(2, new Book(2, "The Sound and the Fury", "William Faulkner"));
        db.put(3, new Book(3, "To the Lighthouse", "Virginia Woolf"));
    }


    public List<Book> add(Book book) {
        Book bk = findById(book.getId());
        if (bk == null) {
            db.put(book.getId(), book);
        }
        return all();
    }



    private Book findById(int id) {
        return db.get(id);
    }

    private List<Book> all() {
        return db.values().stream().collect(Collectors.toList());
    }
}
