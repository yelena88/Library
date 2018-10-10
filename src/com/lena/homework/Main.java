package com.lena.homework;

public class Main {

    public static void main(String[] args) {
        // создаем книги
        Book book1 = new Book("Война и мир","Лев Толстой");
        Book book2 = new Book("Преступление и наказание","Федор Достоевский");
        Book book3 = new Book("Собачье сердце","Михаил Булгаков");
        Book books[] = new Book[]{book1,book2,book3};

        // завозим книги в библиотеку! =)
        Library library = new Library(books);

        // берем книгу
        library.getBooks();
        Reader reader1 = new Reader("Лена", "Зейликович");
        library.RentBook("Собачье сердце", reader1);

        // пробуем взять эту книгу снова
        library.RentBook("Собачье сердце", new Reader("Шариков", "Собаков"));

        // проверяем список книг
        library.getBooks();

        //возвращаем книгу
        library.ReturnBook("Собачье сердце", reader1);

        // проверяем список книг
        library.getBooks();
    }
}
