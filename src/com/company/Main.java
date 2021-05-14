package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Russel","Winderand");
        Book book = new Book("Developing Java Software", author.getFirstName() + " " + author.getLastName(), 79.75 );
        System.out.println(book.getTitle() + " Written by " + book.getAuthor());
        System.out.println("price is only " + book.getPrice() + "$");
    }
}
