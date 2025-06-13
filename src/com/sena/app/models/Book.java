package com.sena.app.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    // Atributos básicos
    private static int nextId = 1;
    private int id;
    private String title;
    private String edititionDate;
    private String editorial;
    private String isbn;

    // Nuevos atributos
    private List<String> authors;
    private boolean readed;
    private int timeReaded;

    // Constructor completo
    public Book(String title, String edititionDate, String editorial, String isbn) {
        this.id = nextId++;
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
        this.authors = new ArrayList<>();
        this.readed = false;
        this.timeReaded = 0;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEdititionDate() {
        return edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    // Getters y Setters básicos
    // TODO: Implementar getters y setters
    public String getIsbn() {
        return isbn;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public boolean isReaded() {
        return readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", edititionDate='" + edititionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}