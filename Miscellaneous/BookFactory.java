public class BookFactory implements LibraryItemFactory {
          @Override
          public LibraryItem createLibraryItem(String id, String title, String author) {
              return new Book(id, title, author);
          }
      }
      