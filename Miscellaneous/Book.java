public class Book implements LibraryItem {
          private String id;
          private String title;
          private String author;
      
          public Book(String id, String title, String author) {
              this.id = id;
              this.title = title;
              this.author = author;
          }
      
          @Override
          public String getDetails() {
              return "Book ID: " + id + ", Title: " + title + ", Author: " + author;
          }
      
          @Override
          public boolean borrowItem(User user) {
              System.out.println(user.getName() + " borrowed the book: " + title);
              return true;
          }
}
      