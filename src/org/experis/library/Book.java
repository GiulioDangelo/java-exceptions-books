package org.experis.library;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String editor;

    public Book(String title, int pages, String author, String editor) {
        validateString(title);
        this.title  = title;

        validateInt(pages);
        this.pages  = pages;

        validateString(author);
        this.author = author;

        validateString(editor);
        this.editor = editor;
    }

    private void validateString(String input) throws IllegalArgumentException{
        if (input.isEmpty()){
            throw new IllegalArgumentException("il campo " + input + "non può essere vuoto");
        }
    }

    private void validateInt(int input) throws IllegalArgumentException{
        if (input <= 0){
            throw new IllegalArgumentException("il numero di " + input + "non può essere 0 o minore di 0");
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public void setTitle(String title) {
        validateString(title);
        this.title = title;
    }

    public void setPages(int pages) {
        validateInt(pages);
        this.pages = pages;
    }

    public void setAuthor(String author) {
        validateString(author);
        this.author = author;
    }

    public void setEditor(String editor) {
        validateString(editor);
        this.editor = editor;
    }
}
