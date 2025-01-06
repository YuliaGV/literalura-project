package com.alura.literalura_project.repository;

import com.alura.literalura_project.model.Book;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository {

    @Query("SELECT b FROM Book b WHERE b.title LIKE %:title%")
    List<Book> findByTitleContaining(String title);
}
