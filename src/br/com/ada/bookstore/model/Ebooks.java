package br.com.ada.bookstore.model;

public class Ebooks extends Book {

    private String storedIn;

    public Ebooks() {
    }

    public String getStoredIn() {
        return storedIn;
    }

    public void setStoredIn(String storedIn) {
        this.storedIn = storedIn;
    }

    @Override
    public void loanBook(boolean isLoaned, String loanedTo) {
        System.err.println("Erro! Você não pode emprestar um ebook!");
    }


    @Override
    public String toString() {
        return super.toString() +
                " * Ebook armazenado no " + storedIn +
                " *";
    }
}