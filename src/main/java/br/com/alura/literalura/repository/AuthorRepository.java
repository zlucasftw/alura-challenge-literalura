package br.com.alura.literalura.repository;

import br.com.alura.literalura.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    @Query("SELECT b FROM AuthorEntity a INNER JOIN a.book b WHERE a.")

}
