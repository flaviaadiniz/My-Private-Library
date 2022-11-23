package br.com.ada.bookstore.business;
import br.com.ada.bookstore.repository.BookRepository;

import java.util.Scanner;

public class MyLibrary {

    private static final BookRepository bookRepository = new BookRepository();

    public static void main(String[] args) {

        printHeading();

        int opcaoSelecionada;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar livro novo");
            System.out.println("2 - Registrar empréstimo");
            System.out.println("3 - Imprimir lista de livros");
            System.out.println("4 - Sair do Sistema");

            Scanner scanner = new Scanner(System.in);

            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    bookRepository.register();
                    System.out.println("");
                    break;
                case 2:
                    bookRepository.printRegisteredBooks();
                    bookRepository.loanBook();
                    break;
                case 3:
                    bookRepository.printRegisteredBooks();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("“A leitura engrandece a alma.” - Voltaire");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoSelecionada != 4);


    }

    public static void printHeading() {
        System.out.println("-------------------------------------");
        System.out.println("* * * * * MINHA BIBLIOTECA * * * * *");
        System.out.println("-------------------------------------");
    }

}
