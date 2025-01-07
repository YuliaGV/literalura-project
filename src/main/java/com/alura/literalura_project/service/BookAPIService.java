package com.alura.literalura_project.service;

import com.alura.literalura_project.APIdto.BookAPIDTO;
import com.alura.literalura_project.APIdto.BookApiResponseDTO;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class BookAPIService {

    private final String urlBase = "https://gutendex.com/books/";

    public List<BookAPIDTO> findBooksByTitle(String text) {
        var json = APIRequest.consumeAPI(
                urlBase + "?search="
                        + URLEncoder.encode(text.trim().toLowerCase(), StandardCharsets.UTF_8)
        );
        return new ConvertData().getData(json, BookApiResponseDTO.class).booksList();
    }


}
