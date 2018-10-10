package com.lena.homework;

import java.util.Arrays;

public class Library {
    private Book[] books;        // держит все книги
//    private Reader[] readers;  // держит наших читателей

    public Library(Book[] books) {
        this.books = books;
//        this.readers = readers;
    }

    public void getBooks() {
        System.out.println("Наша библиотека предлагает следуйщие книги: ");
        for (Book b :
                books) {
            System.out.println(b.getName() + ", автор " + b.getAuthor() + ", одолжена? [" + b.isRented() + "]");
        }
        System.out.println();
    }

    public void RentBook(String bookName, Reader reader) {
        if (reader.getBookRead() == null) {
            for (Book b :
                    books) {
                if (bookName.equals(b.getName())) {
                    if (!b.isRented()) {
                        reader.setBookRead(b);
                        b.setRented(true);
                        System.out.println(reader.getFirstName() + " " + reader.getLastName() + " успешно одолжил(a) \"" + b.getName() + "\"");
                    }
                    else
                        System.out.println("Извините " + reader.getFirstName() + " " + reader.getLastName() + ", но эту книгу уже читают!");
                }
            }
        }
        else {
            System.out.println("Вы уже читаете книгу " + reader.getBookRead().getName());
        }
    }

    public void ReturnBook(String bookName, Reader reader){
        for (Book b : books) {
            if (b.isRented() && bookName.equals(b.getName())){
                b.setRented(false);
                reader.setBookRead(null);
                System.out.println("Благодарим вас " + reader.getFirstName() + " " + reader.getLastName() + " за возвращение " + b.getName() + "!");
            }
        }
    }
}
