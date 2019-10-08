package fr.esir.jxc;

import controllers.UserController;
import models.Address;
import models.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UTUserController {
    private UserController userController;
    private List<User> returnedUserList;
    private List<User> expectedUserList;

    @BeforeAll
    public void initTests() {
        // Initialize userController
        userController = new UserController();

        // Initialize returnedUserList
        returnedUserList = new ArrayList<User>();

        // Initialize expectedUserList
        expectedUserList = new ArrayList<User>();

        // Initialize some Address objects
        Address address1 = new Address("35000", "default street", 1, "complement");
        Address address2 = new Address("35000", "default street", 2, "complement");

        // Initialize some sets of friendsIds
        List<String> friendsIds1 = new ArrayList<String>();
        friendsIds1.add("friendId1");
        friendsIds1.add("friendId2");
        friendsIds1.add("friendId3");

        List<String> friendsIds2 = new ArrayList<String>();
        friendsIds2.add("friendId1");
        friendsIds2.add("friendId2");
        friendsIds2.add("friendId3");

        // Initialize some User objects
        User user1 = new User("username1", "email@user1.com", "photourl1.com", "bio1", address1, friendsIds1);
        User user2 = new User("username2", "email@user2.com", "photourl2.com", "bio2", address2, friendsIds2);

        returnedUserList.add(user1);
        returnedUserList.add(user2);

        expectedUserList.add(user1);
        expectedUserList.add(user2);
    }

    @Test
    public void getUsersList_ShouldRetrieveAllUsers_OK() {
        UserController userController = mock(UserController.class);
        when(userController.getUsersList()).thenReturn(returnedUserList);

        List<User> userList = userController.getUsersList();

        Assert.assertEquals(expectedUserList, userList);
    }
}
