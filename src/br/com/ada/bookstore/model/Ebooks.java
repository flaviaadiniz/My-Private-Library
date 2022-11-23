package br.com.ada.bookstore.model;

import br.com.ada.bookstore.enumeracao.NonFictionGenres;

public class NonFiction extends Book {

    private String genre;
    private boolean isLoaned;
    private String loanedTo;


    public NonFiction() {
        super();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isLoaned() {
        return isLoaned;
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
        return super.toString() +
                " | Gênero: " + genre +
                " ]";
    }

}
