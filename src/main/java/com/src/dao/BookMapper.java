package com.src.dao;

import com.src.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Books books);

    int deleteBookById(@Param("BookId") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("BookId")int id);

    List<Books> queryAllBook();

}
