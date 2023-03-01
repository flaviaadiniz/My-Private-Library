package br.com.ada.bookstore.model;

public class PhysicalBooks extends Book {

    private boolean loaned;
    private String loanedTo;

    public PhysicalBooks() {
        super();
        loaned = false;
        loanedTo = null;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public String getLoanedTo() {
        return loanedTo;
    }

    public void setLoanedTo(String loanedTo) {
        this.loanedTo = loanedTo;
    }

    @Override
    public void loanBook(boolean isLoaned, String loanedTo) {
        setLoaned(isLoaned);
        setLoanedTo(loanedTo);
    }

    @Override
    public String toString() {
        if (loaned) {
            return super.toString() +
                    " * LIVRO EMPRESTADO para " + loanedTo +
                    "*";
        } else {
            return super.toString();
        }
    }

}
