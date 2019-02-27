import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookSelfInterface extends Remote {

    // Get book with bookId from bookShelf
    public Book getBook(int bookId) throws RemoteException ;

    // Insert a book to bookshelf
    public void insertBook(Book book) throws RemoteException ;
}
