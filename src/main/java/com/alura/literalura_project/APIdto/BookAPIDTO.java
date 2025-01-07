package com.alura.literalura_project.APIdto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookAPIDTO(
        @JsonAlias("title") String title,
        @JsonAlias("authors") List<AuthorAPIDTO> authors,
        @JsonAlias("languages") List<String> languages,
        @JsonAlias("download_count") Double downloadCount
) {}