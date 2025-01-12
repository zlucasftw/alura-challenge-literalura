package br.com.alura.literalura.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long birth_year;

    private Long death_year;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BookEntity> book = new ArrayList<>();

    public AuthorEntity(String name, Long birth_year, Long death_year, List<BookEntity> book) {
        this.name = name;
        this.birth_year = birth_year;
        this.death_year = death_year;
        this.book = book;
    }

    public AuthorEntity() {
    }

    public String getName() {
        return name;
    }

    public Long getBirth_year() {
        return birth_year;
    }

    public Long getDeath_year() {
        return death_year;
    }

    public List<BookEntity> getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "name='" + name + '\'' +
                ", birth_year=" + birth_year +
                ", death_year=" + death_year +
                ", book=" + book +
                '}';
    }
}
