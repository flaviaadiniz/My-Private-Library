package br.com.ada.bookstore.repository;

import br.com.ada.bookstore.model.Book;
import br.com.ada.bookstore.model.PhysicalBooks;
import br.com.ada.bookstore.model.Ebooks;
import br.com.ada.bookstore.model.Registrable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRepository implements Registrable {

    private List<Book> bookRepository = new ArrayList<>();
    private static int sequence = 1;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void register() {
        System.out.println("Vamos cadastrar um livro!");
        System.out.print("Livro físico digite 1 | e-Book digite 2. ");
        int kindOfBook = scanner.nextInt();
        scanner.nextLine();

        if (kindOfBook == 1) {
            bookRepository.add(registerPhysicalBook());
        } else if (kindOfBook == 2) {
            bookRepository.add(registerEbook());
        } else {
            System.out.println("Resposta inválida!");
        }
    }

    public PhysicalBooks registerPhysicalBook() {
        System.out.print("Nome do(a) autor(a): ");
        String author = scanner.nextLine();

        System.out.print("Nome do livro: ");
        String title = scanner.nextLine();

        System.out.print("Gênero: ");
        String genre = scanner.nextLine();

        PhysicalBooks bookPhysicalBooks = new PhysicalBooks();
        bookPhysicalBooks.setAuthor(author);
        bookPhysicalBooks.setTitle(title);
        bookPhysicalBooks.setGenre(genre);
        bookPhysicalBooks.setId(sequence);
        sequence++;
        System.out.println("Livro cadastrado com sucesso!");

        return bookPhysicalBooks;
    }

    public Ebooks registerEbook() {
        System.out.print("Nome do(a) autor(a): ");
        String author = scanner.nextLine();

        System.out.print("Nome do livro: ");
        String title = scanner.nextLine();

        System.out.print("Gênero: ");
        String genre = scanner.nextLine();

        System.out.print("Onde está armazenado? ");
        String storedIn = scanner.nextLine();

        Ebooks bookEbooks = new Ebooks();
        bookEbooks.setAuthor(author);
        bookEbooks.setTitle(title);
        bookEbooks.setGenre(genre);
        bookEbooks.setStoredIn(storedIn);
        bookEbooks.setId(sequence);
        System.out.println("Livro cadastrado com sucesso!");
        sequence++;

        return bookEbooks;
    }

    public void loanBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do livro que vai emprestar: ");
        int bookID = scanner.nextInt();
        int bookIndex = (bookID - 1);

        System.out.println("Digite o nome da pessoa que vai pegar o livro: ");
        String name = scanner.next();
        bookRepository.get(bookIndex).loanBook(true, name);

    }

    public void printRegisteredBooks() {
        System.out.println("* * LIVROS CADASTRADOS * *");
        for (Book book : bookRepository) {
            System.out.println(book);
        }

        if (bookRepository.isEmpty()) {
            System.out.println("Não há livros cadastrados!");
        }
    }



}

