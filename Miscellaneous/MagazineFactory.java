public class MagazineFactory implements LibraryItemFactory {
          @Override
          public LibraryItem createLibraryItem(String id, String title, String issue) {
              return new Magazine(id,title,issue);
          }
      }
      