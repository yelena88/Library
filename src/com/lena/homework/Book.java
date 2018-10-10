package com.lena.homework;

public class Book {
    private String name;
    private String description;
    private String author;
    private boolean isRented = false;
    private Reader reader;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void borrow(Reader person) {
        setRented(true);
        this.reader = person;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Reader getReader() {
        return reader;
    }

    public boolean isRented() {
        return isRented;
    }

    public String getAuthor() {
        return author;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return name + ", автор " + author;
    }
}
