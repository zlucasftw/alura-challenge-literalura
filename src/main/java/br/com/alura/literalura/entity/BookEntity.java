package br.com.alura.literalura.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    private Long download_count;

    // private List<String> idiomas = new ArrayList<>();

    @ManyToOne
    private AuthorEntity author;

    public BookEntity(String title, Long download_count, AuthorEntity author) {
        this.title = title;
        this.download_count = download_count;
        this.author = author;
    }

    public BookEntity() {}

    public String getTitle() {
        return title;
    }

    public Long getDownload_count() {
        return download_count;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "title='" + title + '\'' +
                ", download_count=" + download_count +
                ", author=" + author +
                '}';
    }
}
