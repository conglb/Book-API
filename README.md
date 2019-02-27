# Book API
## Requirement
Client send `getBook(int bookId)`to get book satisfy id = bookId.
Client send `insertBook(Book book)` to add a book.
## Design
### Server
- class Book extends Serializable
- interface BookShelfInterface
    * Book getBook(int bookId)
    * void insertBook(Book book)
- class BookShelf implement BookShelfInterface
- class Main
### Client
- interface BookShelfInterface
- class Main