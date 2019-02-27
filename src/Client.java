import java.rmi.Naming;

public class Client {

    public static void main(String args[]) throws Exception{
        BookSelfInterface bookShelf = (BookSelfInterface) Naming.lookup("MyBookshelf");
        Book book = bookShelf.getBook(1);
        System.out.println(book.toString());
        book = bookShelf.getBook(2);
        System.out.println(book.toString());
    }
}
