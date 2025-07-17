package JAVA.BroCode;

class Book{
    String title;

    Book(String name){
        this.title = name;
    }
}


class Library{
     String name;
     Book[] books;

    Library(String name,Book[] books){
        this.name = name;
        this.books = books;

    }

    Book[] showLibraryBooks(){
        return this.books;
    }
}

// Library has a relationship with the book


public class Aggregation {
    public static void main(String[] args) {
        // Aggregation 
        // - "has a" relationship 
        // - one object will be part of another object 
        // the child object can exist freely also; 

        Book book1 = new Book("Harry Potter-1"); 
        Book book2 = new Book("Harry Potter-2");
        Book book3 = new Book("Harry Potter-3"); 

        Book[] bookCollections = {book1, book2}; 

        Library lib_1 = new Library("Kalam Library", bookCollections);  

        Book[] lib_1_collections = lib_1.showLibraryBooks();

        for(Book book: lib_1_collections){
            System.out.println(book.title);
        }

    }
}
