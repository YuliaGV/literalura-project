package com.alura.literalura_project.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne(optional = false)
    private Author author;

    @Column(nullable = false)
    private String language;

    @Column(name = "download_count", nullable = false)
    private Integer downloadCount;

}
