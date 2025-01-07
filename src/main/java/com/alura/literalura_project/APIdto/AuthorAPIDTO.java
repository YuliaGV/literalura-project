package com.alura.literalura_project.APIdto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorAPIDTO(
        @JsonAlias("name") String name,
        @JsonAlias("birth_year") String yearOfBirth,
        @JsonAlias("death_year") String yearOfDeath
) {}