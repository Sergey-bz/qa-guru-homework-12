package guru.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class UsersListTest {

    private UsersList usersList = new UsersList();

    @BeforeEach
    public void setUp() {
        usersList.addUser(new User(1, "first@email.com"));
        usersList.addUser(new User(2, "second@email.com"));
        usersList.addUser(new User(3, "third@email.com"));
    }

    @Test
    public void addUsersTest() {
        assertThat(usersList.getUsers().size(), equalTo(3));
    }

    @Test
    public void searchUserTest() {
        assertThat(usersList.searchUserById(2).getEmail(), equalTo("second@email.com"));
    }

    @Test
    public void deleteUserTest() {
        User user = new User(1, "first@email.com");
        usersList.deleteUser(user);
        assertThat(usersList.getUsers(), not(contains(user)));
    }
}
