# Book API
## Requirement
- Client send `getBook(int bookId)`to get book satisfy id = bookId.
- Client send `insertBook(Book book)` to add a book.
## Design
### Server
- class Book extends Serializable
- interface BookShelfInterface
    * Book getBook(int bookId)
    * void insertBook(Book book)
- class BookShelf implement BookShelfInterface
- class Server
### Client
- interface BookShelfInterface
- class Client
## Run
~~~~
javac Server.java
javac Client.java
rmiregistry
java Server
java Client
~~~~
### Screenshoot
![alt text](/screenshoot/client.png)
