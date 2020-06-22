package com.aaa.springcloud.controller;

import com.aaa.czb.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 十八
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject("http://localhost:8085/all",List.class);
    }
}
