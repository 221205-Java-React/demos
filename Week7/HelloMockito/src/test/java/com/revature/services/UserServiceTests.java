package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTests {

    @Mock //mock instance - not a real object. used as a placeholder to facilitate our test writing
    private UserDAO mockedDAO = new UserDAO();

    @Spy //real instance that we can track, aka "spy" on with certain methods like verify()
    private UserService testInstance = new UserService(mockedDAO);

    //Regular User object to help with tests
    private User u = new User(1, "coolUsername", "password");

    @Before //this method will run BEFORE any tests run.
    public void setup() {
        MockitoAnnotations.openMocks(this);
        //due to these two lines of code,
        //the user returned by the DAO will always be User u when given certain parameters
        //when(mockedDAO.findByUsername("coolUsername")).thenReturn(u);
        //when(mockedDAO.findById(1)).thenReturn(u);
    }

    @Test
    public void testLoginByNameSuccess() {
        //assert that a successful login returns the appropriate User.
        Assert.assertTrue(testInstance.loginWithName("coolUsername", "password").equals(u));

        //make sure that the findByUsername method of the UseDAO ran once (test fails if not)
        verify(mockedDAO, times(1)).findByUsername("coolUsername");
    }



}