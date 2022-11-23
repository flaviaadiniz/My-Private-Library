package br.com.ada.bookstore.business;

public class Bookstore {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        printHeading();




    }

    public static void printHeading() {
        System.out.println(ANSI_PURPLE + "-------------------------------------");
        System.out.println("     * * LIVRARIA BOOKAHOLIC * *     ");
        System.out.println("-------------------------------------" + ANSI_RESET);
    }

}
