package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
private String name;
private String Id;
private Book[] book = new Book[5];

    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id)
    {
        this.name = name;
        this.Id = Id;
    }
 
    // public  getName() {}
    public String getName()
    {
        return name;
    }
    // public  setName() {}
    public void setName(String name)
    {
        this.name = name;
    }
    // public  getId() {}
    public String getId()
    {
        return Id;
    }
    // public void setId() {}
    public void setId(String Id)
    {
        this.Id = Id;
    }
    // public getBooks() {}
    public Book[] getBooks()
    {
        return book;
    }
    // public setBooks() {}
    public void setBooks(Book[] book)
    {
        this.book = book;
    }
    // public String bookListInfo(){} 
    public String bookListInfo() 
    {
        StringBuilder bookList = new StringBuilder();
        boolean isEmpty = true;

        for (Book book : this.book) 
        {
            if (book != null) 
            {
                bookList.append(book.bookInfo()).append("\n");
                isEmpty = false;
            } 
            else 
            {
                bookList.append("empty\n");
            }
        }

        return bookList.toString();
    }
    
    // public String userInfo(){} //returns  "Name: []\nID: []\nBooks:\n[]"
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }
}