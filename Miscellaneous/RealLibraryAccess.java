import java.util.HashMap;
import java.util.Map;

public class RealLibraryAccess implements LibraryAccess {
    private Map<String, LibraryItem> libraryItems = new HashMap<>();

    public void addLibraryItem(LibraryItem item) {
        libraryItems.put(item.getDetails().split(": ")[1], item); // Use ID as key
    }

    @Override
    public boolean accessItem(String itemID, User user) {
        LibraryItem item = libraryItems.get(itemID);
        if (item != null) {
            System.out.println("Accessing item: " + item.getDetails());
            return item.borrowItem(user);
        }
        System.out.println("Item not found: " + itemID);
        return false;
    }
}
