package com.example.project;

public class Main
{
    public static void main(String[] args)
    {
        IdGenerate.reset(); //reset for test
        IdGenerate.generateID();
        User u1 = new User("John",IdGenerate.getCurrentId());
        System.out.println(u1.userInfo());

        IdGenerate.generateID();
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        User u2 = new User("Jane",IdGenerate.getCurrentId());
        Book[] books = new Book[5];
        books[0] = b1;
        u2.setBooks(books);
        System.out.println(u2.userInfo());
    }
}