package com.alura.literalura_project.APIdto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookApiResponseDTO(
        @JsonAlias("results") List<BookAPIDTO> booksList
){}