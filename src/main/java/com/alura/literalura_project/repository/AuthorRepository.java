package com.alura.literalura_project.repository;

import com.alura.literalura_project.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE a.yearOfBirth <= :selectedYear AND (a.yearOfDeath > :selectedYear OR a.yearOfDeath IS NULL)")
    List<Author> findLivingAuthorsByYear(int selectedYear);

}
