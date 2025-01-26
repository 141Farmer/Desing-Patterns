public class Main {
          public static void main(String[] args) {

              LibraryItemFactory bookFactory = new BookFactory();
              LibraryItem book = bookFactory.createLibraryItem("1", "Java Programming", "John Doe");

              LibraryItemFactory magazineFactory = new MagazineFactory();
              LibraryItem magazine = magazineFactory.createLibraryItem("2", "Tech Today", "January 2025");

              System.out.println(book.getDetails());
              System.out.println(magazine.getDetails());
          }
      }
      