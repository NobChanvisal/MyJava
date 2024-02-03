// A short package demonstration.
package BookPack;

class Book {
   private String title;
   private String author;
 private int pubDate;

   Book (String t, String a, int d){
      title = t;
      author = a;
  pubDate = d;
   }
   void show() {
      System.out.println(title);
      System.out.println(author);
      System.out.println(pubDate);
      System.out.println();
   }
}
class BookDemo {
   public static void main(String args[]){
      Book books[] = new Book[3];

      books[0] = new Book("Java Beginners Guide", "Schildt", 2001);
      books[1] = new Book("Java 2 Programmers Reference",
        "Schildt", 2000);
      books[2] = new Book("HTML Programmers Reference", 
  "Powell and Whitworth", 1998);

      for (int i = 0; i < books.length; i++)
     books[i].show();
   }
}
