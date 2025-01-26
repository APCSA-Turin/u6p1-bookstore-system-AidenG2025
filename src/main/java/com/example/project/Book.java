package com.example.project;

public class Book
{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;



    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPUblished, String isbn, int quantity)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPUblished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // public  getTitle() {}
    public String getTitle()
    {
        return title;
    }

    // public setTitle() {}
    public void setTitle(String title)
    {
        this.title = title;
    }
    // public getAuthor() {}
    public String getAuthor()
    {
        return author;
    }
    // public void setAuthor() {}
    public void setAuthor(String author)
    {
        this.author = author;
    }
    // public getYearPublished() {}
    public int getYearPublished()
    {
        return yearPublished;
    }
    // public setYearPublished() {}
    public void setYearPublished(int yearPUblished)
    {
        this.yearPublished = yearPUblished;
    }
    // public getIsbn() {}
    public String getIsbn()
    {
        return isbn;
    }
    // public void setIsbn() {}
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    // public int getQuantity() {}
    public int getQuantity()
    {
        return quantity;
    }
    // public void setQuantity() {}
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    // public  bookInfo(){} //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       public String bookInfo()
       {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
       }
}