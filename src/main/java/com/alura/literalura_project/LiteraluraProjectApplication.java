package com.alura.literalura_project;

import com.alura.literalura_project.model.Book;
import com.alura.literalura_project.repository.AuthorRepository;
import com.alura.literalura_project.repository.BookRepository;
import com.alura.literalura_project.service.BookAPIService;
import com.alura.literalura_project.start.Start;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraProjectApplication implements CommandLineRunner {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookAPIService bookAPIService;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Start start = new Start(authorRepository, bookRepository, bookAPIService);
		start.showMenu();
	}

}
