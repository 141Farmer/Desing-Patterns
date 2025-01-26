import java.util.List;

public class User {
    private String name;
    private List<String> permissions;

    public User(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public boolean hasPermission(String itemID) {
        return permissions.contains(itemID);
    }
}
