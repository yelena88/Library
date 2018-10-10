package com.lena.homework;

public class Reader {
    private String firstName;
    private String lastName;
    private Book bookRead;

    public Reader(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Book getBookRead() {
        return bookRead;
    }

    public void setBookRead(Book bookRead) {
        this.bookRead = bookRead;
    }

    public void read(){
        if (bookRead != null) {
            System.out.println("Сейчас я читаю " + bookRead.getName());
        }
    }
}
