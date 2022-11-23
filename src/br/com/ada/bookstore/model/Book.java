package br.com.ada.bookstore.model;

import java.util.Scanner;

public abstract class Book {

    private String author;
    private String title;
    private String genre;
    private int id;

    public Book() {
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void loanBook(boolean isLoaned, String loanedTo) {
        System.err.println("Erro! Você deve implementar este método");
    }

    @Override
    public String toString() {
        return "Livro [ " +
                "ID: " + id +
                " | Autor: " + author +
                " | Título: " + title +
                " | Gênero: " + genre +
                " ]";
    }
}
