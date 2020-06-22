package com.aaa.czb.springcloud.controller;

import com.aaa.czb.springcloud.model.Book;
import com.aaa.czb.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        System.out.println("8087");
        return bookService.selectAllBooks();
    }
}
