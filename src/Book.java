import java.io.Serializable;

public class Book implements Serializable {

    // serial version uid
    private static final long serialVersionUID = 1193049580361470L;

    // book id
    private int id;
    // book information
    private String title, author, ISBN;

    // constructor
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

    // return entire book information
    public String toString() {
        return "Id: " + getId() + '\n' + "Title: " + getTitle() + '\n' + "Author: " +  getAuthor()
        + '\n' + "ISBN: " + getISBN() + '\n';
     }
}
