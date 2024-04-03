package org.experis.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quanti libri vuoi aggiungere?");
        int index = scan.nextInt();
        scan.nextLine();
        Book[] list = new Book[index];

        try {
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

                list[i] = new Book(title,pages,author,editor);
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



        try (FileWriter fileWriter = new FileWriter("./resources/data.txt")){
            for (Book element : list) {
                fileWriter.write(element.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(Scanner fileReader = new Scanner(new File("./resources/data.txt"))){
            while (fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }

        scan.close();
    }
}
