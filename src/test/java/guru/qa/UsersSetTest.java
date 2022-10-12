package guru.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class UsersSetTest {

    private UsersSet usersSet = new UsersSet();

    @BeforeEach
    public void setUp() {
        usersSet.addUser(new User(1, "first@email.com"));
        usersSet.addUser(new User(2, "second@email.com"));
        usersSet.addUser(new User(3, "third@email.com"));
    }

    @Test
    public void addUsersTest() {
        assertThat(usersSet.getUsers().size(), equalTo(3));
    }

    @Test
    public void searchUserTest() {
        assertThat(usersSet.searchUserById(2).getEmail(), equalTo("second@email.com"));
    }

    @Test
    public void deleteUserTest() {
        User user = new User(1, "first@email.com");
        usersSet.deleteUser(user);
        assertThat(usersSet.getUsers(), not(contains(user)));
    }
}
