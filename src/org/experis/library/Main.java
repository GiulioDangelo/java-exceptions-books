package org.experis.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quanti libri vuoi aggiungere?");
        int index = scan.nextInt();
        scan.nextLine();
        Book[] list = new Book[index];

        for (int i = 0; i < list.length; i++) {
            System.out.println("qual'è il titolo del libro?");
            String title = scan.nextLine();

            System.out.println("quanti pagine ha?");
            int pages = scan.nextInt();
            scan.nextLine();

            System.out.println("chi è l'autore?");
            String author = scan.nextLine();

            System.out.println("chi è l'editore?");
            String editor = scan.nextLine();

            Book book = new Book(title,pages,author,editor);
        }
    }
}
