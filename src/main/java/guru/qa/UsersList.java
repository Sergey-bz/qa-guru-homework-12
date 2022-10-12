package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class UsersList {

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
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

    public void print() {
        System.out.println(users);
    }
}
