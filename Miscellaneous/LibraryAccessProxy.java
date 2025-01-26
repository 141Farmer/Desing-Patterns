public class LibraryAccessProxy implements LibraryAccess {
          private RealLibraryAccess realLibraryAccess;
      
          public LibraryAccessProxy(RealLibraryAccess realLibraryAccess) {
              this.realLibraryAccess = realLibraryAccess;
          }
      
          @Override
          public boolean accessItem(String itemID, User user) {
              if (!user.hasPermission(itemID)) {
                  System.out.println("Access denied for user: " + user.getName());
                  return false;
              }
              return realLibraryAccess.accessItem(itemID, user);
          }
      }
      