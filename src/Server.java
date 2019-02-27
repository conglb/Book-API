import java.rmi.Naming;

public class Server {

    public static void main(String args[]) {
        try {
            BookShelf bookShelf = new BookShelf();
            Naming.rebind("MyBookshelf", bookShelf);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
