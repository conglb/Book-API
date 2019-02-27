import java.rmi.Naming;

public class Server {

    public static void main(String args[]) {
        try {
            // init bookshelf store book
            BookShelf bookShelf = new BookShelf();

            // Register a object with name Mybookshelf to rmiregistry server
            // allow client to query
            Naming.rebind("MyBookshelf", bookShelf);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
