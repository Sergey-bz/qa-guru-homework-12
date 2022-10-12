package guru.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class UsersMapTest {

    private UsersMap usersMap = new UsersMap();

    @BeforeEach
    public void setUp() {
        usersMap.addUser(1,new User(1, "first@email.com"));
        usersMap.addUser(2, new User(2, "second@email.com"));
        usersMap.addUser(3, new User(3, "third@email.com"));
    }

    @Test
    public void addUsersTest() {
        assertThat(usersMap.getUsers().size(), equalTo(3));
    }

    @Test
    public void searchUserTest() {
        assertThat(usersMap.searchUserById(2).getEmail(), equalTo("second@email.com"));
    }

    @Test
    public void deleteUserTest() {
        usersMap.deleteUser(1);
        assertThat(usersMap.getUsers().keySet(), not(contains(1)));
    }
}
