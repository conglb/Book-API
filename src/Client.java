import java.rmi.Naming;

public class Client {

    public static void main(String args[]) throws Exception{
        BookSelfInterface bookShelf = (BookSelfInterface) Naming.lookup("MyBookshelf");

        // Print book with id 1 !!!
        Book book = bookShelf.getBook(1);
        System.out.println(book.toString());

        // Print book with id 2 !!!
        book = bookShelf.getBook(2);
        System.out.println(book.toString());

        // Add a book with id 10 to sever's bookshelf
        Book dsa = new Book(10, "Data Structure and Algorithm", "Steven Job", "12789");
        bookShelf.insertBook(dsa);

        // Print book which recently add
        book = bookShelf.getBook(10);
        System.out.println(book.toString());
    }
}
