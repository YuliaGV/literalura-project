package com.alura.literalura_project.start;

import com.alura.literalura_project.APIdto.BookAPIDTO;
import com.alura.literalura_project.repository.AuthorRepository;
import com.alura.literalura_project.repository.BookRepository;
import com.alura.literalura_project.service.APIRequest;
import com.alura.literalura_project.service.BookAPIService;


import java.util.Scanner;
import java.util.stream.Collectors;

public class Start {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final BookAPIService bookApiService;
    private final Scanner sc = new Scanner(System.in);

    public Start(AuthorRepository authorRepository, BookRepository bookRepository, BookAPIService bookApiService) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.bookApiService = bookApiService;
    }

    public void showMenu(){
        findBookByTitle();
    }

    private void findBookByTitle() {

        System.out.println("Escribe el nombre del libro que estás buscando:");
        String bookName = sc.nextLine();

        System.out.println("Buscando....");
        var bookData = bookApiService.findBooksByTitle(bookName).stream().findFirst();

        bookData.ifPresentOrElse(
                book -> {
                    System.out.println("Libro encontrado:");
                    System.out.println("Título: " + book.title());
                    System.out.println("Autor(es): " + book.authors().stream()
                            .map(author -> author.name() + " (" + author.yearOfBirth() + " - " + author.yearOfDeath()+ ")")
                            .collect(Collectors.joining(", ")));
                    System.out.println("Idiomas: " + book.languages().stream().findFirst().orElse(""));
                    System.out.println("Descargas: " + book.downloadCount());
                },
                () -> System.out.println("No se encontró el libro")
        );


    }




}
