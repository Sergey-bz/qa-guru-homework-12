package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class UsersSet {

    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User searchUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void deleteUser(User user) {
        users.remove(user);
    }
}
