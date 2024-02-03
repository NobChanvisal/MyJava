package BookPackB;//This class is in package BookPackB.

//Use the book class from BookPack.
public class UseBook {
    public static void main(String[] args) {
        BookPack.Book books[] = new BookPack.Book[3];
        books[0] = new BookPack.Book("Java","Schildt",2001);
        books[1] = new BookPack.Book("Java 2","Schildt",2000);
        books[2] = new BookPack.Book("HTML","Powell and Whitworth",1998);
        for(int i =0; i<3; i++){
            books[i].show();
        }
    }
}
