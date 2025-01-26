package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[0];
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore()
    {

    }

    // public getUsers(){}
    public User[] getUsers() 
    {
        return users;
    }

    // public setUsers(){}
    public void setUsers(User[] users) 
    {
        this.users = users;;
    }

    // public  getBooks(){}
    public Book[] getBooks() 
    {
        return books;
    }

    // public void addUser(User user){} 
    public void addUser(User user) 
    {
        for (int i = 0; i < users.length; i++) 
        {
            if (users[i] == null) 
            {
                users[i] = user; 
                return;
            }
        }
        System.out.println("User list is full.");
    }

    // public void removeUser(User user){}
    public void removeUser(User user) 
    {
        for (int i = 0; i < users.length; i++) 
        {
            if (users[i] != null && users[i].getId().equals(user.getId())) 
            {
                users[i] = null; // Remove the user
                consolidateUsers(); // Reorganize the array after removal
                return;
            }
        }
        System.out.println("User not found.");
    }

    // public void consolidateUsers(){}
    public void consolidateUsers() 
    {
        int index = 0;
        for (int i = 0; i < users.length; i++) 
        {
            if (users[i] != null) 
            {
                users[index++] = users[i]; 
            }
        }
        for (int i = index; i < users.length; i++) 
        {
            users[i] = null; 
        }
    }
    // public void addBook(Book book){}
    public void addBook(Book book) 
    {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
    }
    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index) 
    {
        if (index < 0 || index > books.length) {
            System.out.println("Invalid index.");
            return;
        }
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < index; i++) {
            newBooks[i] = books[i];
        }
        newBooks[index] = book;
        for (int i = index; i < books.length; i++) {
            newBooks[i + 1] = books[i];
        }
        books = newBooks;
    }
    // public void removeBook(Book book){}
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) 
        {
            if (books[i] != null && books[i].getIsbn().equals(book.getIsbn())) 
            {
                
                if (books[i].getQuantity() > 1) 
                {
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } 
                else 
                {
                   
                    Book[] newBooks = new Book[books.length - 1];
                    for (int j = 0, k = 0; j < books.length; j++) 
                    {
                        if (j != i) 
                        {
                            newBooks[k++] = books[j];
                        }
                    }
                    books = newBooks;
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes
    public String bookStoreBookInfo() 
    {
        String bookInfo = "";
        for (Book book : books) 
        {
            if (book != null) 
            {
                bookInfo = bookInfo + book.bookInfo() + "\n";
            }
        }
        return bookInfo;
    }
    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes
    public String bookStoreUserInfo() 
    {
        String userInfo = "";
        for (User user : users) 
        {
            if (user != null) 
            {
                userInfo += user.userInfo() + "\n";
            }
        }
        return userInfo;
    }
}