package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class UsersMap {

    private Map<Integer, User> users = new HashMap<>();

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void addUser(int id, User user) {
        users.put(id, user);
    }

    public User searchUserById(int id) {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            if (entry.getKey() == id) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void deleteUser(int id) {
        users.remove(id);
    }
}
