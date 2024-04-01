package com.ankur.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.ankur.domain.Book;
import com.ankur.domain.Status;
import com.ankur.service.BookService;
import org.springframework.stereotype.Component;


import java.util.List;

//Working on AWS
//Not able to test locally - says wrong no of arguements - works on aws lambda
@Component
public class BookAddHandler implements RequestHandler<Book, List<Book>> {
    @Override
    public List<Book> handleRequest(Book book, Context context) {
        BookService bookService=new BookService();
        return bookService.add(book);
    }
}
