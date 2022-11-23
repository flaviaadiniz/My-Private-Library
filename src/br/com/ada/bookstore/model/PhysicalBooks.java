package br.com.ada.bookstore.model;

import java.util.Scanner;

public class Fiction extends Book {

    private String genre;
    private boolean isLoaned;
    private String loanedTo;


    public Fiction() {
        super();
        isLoaned = false;
        loanedTo = null;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public String getLoanedTo() {
        return loanedTo;
    }

    public void setLoanedTo(String loanedTo) {
        this.loanedTo = loanedTo;
    }

    @Override
    public String toString() {
        if (isLoaned) {
            return super.toString() +
                    " | Gênero: " + genre +
                    " | LIVRO EMPRESTADO para " + loanedTo +
                    "]";
        } else {
            return super.toString() +
                    " | Gênero: " + genre +
                    " ]";
        }
    }

}
