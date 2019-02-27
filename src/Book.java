import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 1193049580361470L;

    private int id;
    private String title, author, ISBN;

    public Book() {}

    public Book(int id, String title, String author, String ISBN) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
