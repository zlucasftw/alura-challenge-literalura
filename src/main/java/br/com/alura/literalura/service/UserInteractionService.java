package br.com.alura.literalura.service;

import br.com.alura.literalura.dto.AuthorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserInteractionService {


    private AuthorService authorService = new AuthorService();

    private Scanner scanner = new Scanner(System.in);

    public void optionMenu() {
        var option = -1;
        while (option != 0) {
            System.out.print("""
                    Digite uma das opções a seguir:
                    1 - Buscar livro pelo título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado ano
                    5 - Listar livros em um determinado idioma
                    0 - Sair
                    
                    Escolha o número de sua opção:\s""");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    this.searchBookByTitle();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
    }

    private void searchBookByTitle() {
        String URL = "https://gutendex.com/books?search=";

        System.out.print("Insira o nome do livro que você deseja procurar: ");
        var bookName = scanner.nextLine();

        bookName = bookName.replace(" ", "+").toLowerCase();

        if (this.authorService.searchBook(bookName)) {

        }

       /* System.out.println(author);
        System.out.println("----- LIVRO -----");
        System.out.println("Título: ");
        System.out.println("Autor: ");
        System.out.println("Idioma: ");*/
    }

    private void listRegisteredBooks() {

    }

}
