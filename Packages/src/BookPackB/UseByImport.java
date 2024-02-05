package BookPackB;
import BookPack.*;//Use the Book class from bookpack 
public class UseByImport {
    public static void main(String[] args) {
    
    Book books[] = new Book[3];
    books[0] = new Book("Follow Your heart","Visal",2026);
    books[1] = new Book("Is You","Dara",2020);
    books[2] = new Book("No Name","Thiva",1999);

    for(int i = 0; i<3; i++){
        books[i].show();
    }
}
}
