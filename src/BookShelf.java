import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class BookShelf extends UnicastRemoteObject implements BookSelfInterface {

    // ArrayList of book
    private ArrayList<Book> books = new ArrayList<>();

    public BookShelf() throws RemoteException {
        super();
        books.add(new Book(1,"Tieu ngao giang ho","Kim Dung","123455"));
        books.add(new Book(2,"Tam quoc dien nghia", "La Quan Trung","124578"));
        System.out.println(books.size());
    }

    public Book getBook(int bookId) throws RemoteException {
        for (Book book: books)
            if (book.getId() == bookId)
            {
                return book;
            }
        return null;
    }
    public void insertBook(Book book) throws RemoteException {

    }


}
