package br.com.alura.literalura.service;

import br.com.alura.literalura.dto.BooksDTO;
import br.com.alura.literalura.entity.BookEntity;
import br.com.alura.literalura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository repository;

    DataConverterService converter = new DataConverterService();

    public boolean searchBook(String bookName) {

        var json = ApiFetchService.fetchData("https://gutendex.com/books/?search=" + bookName);
        // AuthorDTO authorDTO = converter.getData(json, AuthorDTO.class);
        BookEntity book = repository.findBookByAuthorName();

        BooksDTO booksDTO = converter.getData(json, BooksDTO.class);

        // System.out.println(authorDTO);
        // booksDTO.books().stream()
        //                 .map(b -> new BookEntity(b.title(), b.download_count()))
        System.out.println(booksDTO);
        return true;
    }

}
