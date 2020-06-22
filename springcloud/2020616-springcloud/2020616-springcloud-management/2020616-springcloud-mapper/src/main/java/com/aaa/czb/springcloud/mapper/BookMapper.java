package com.aaa.czb.springcloud.mapper;

import com.aaa.czb.springcloud.model.Book;

import java.util.List;

/**
 * @author 十八
 */
public interface BookMapper  {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    Book selectByPrimaryKey(Long id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}
