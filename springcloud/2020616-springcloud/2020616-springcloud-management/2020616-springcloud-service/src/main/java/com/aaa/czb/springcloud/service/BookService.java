package com.aaa.czb.springcloud.service;

import com.aaa.czb.springcloud.mapper.BookMapper;
import com.aaa.czb.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 十八
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> selectAllBooks(){
        return bookMapper.selectAll();
    }
}
