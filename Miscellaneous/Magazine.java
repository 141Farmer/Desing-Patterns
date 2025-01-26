public class Magazine implements LibraryItem {
          private String id;
          private String title;
          private String issue;
      
          public Magazine(String id, String title, String issue) {
              this.id = id;
              this.title = title;
              this.issue = issue;
          }
      
          @Override
          public String getDetails() {
              return "Magazine ID: " + id + ", Title: " + title + ", Issue: " + issue;
          }
      
          @Override
          public boolean borrowItem(User user) {
              System.out.println(user.getName() + " borrowed the magazine: " + title);
              return true;
          }
      }
      