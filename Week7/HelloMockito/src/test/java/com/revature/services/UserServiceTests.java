package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.daos.UserDAOInterface;
import com.revature.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

//@RunWith(MockitoJUnitRunner.class) - THIS BROKE MY CODE!!!
public class UserServiceTests {

    @Mock //mock instance - not a real object. used as a placeholder to facilitate our test writing
    private UserDAOInterface mockedDAO;

    @Spy //real concrete instance that we can track, aka "spy" on with certain methods like verify()
    private UserService testInstance = new UserService(mockedDAO);

    //Regular User object to help with tests
    private User u = new User(1, "coolUsername", "password");

    @Before //this method will run BEFORE any tests run.
    public void setup() {
        MockitoAnnotations.openMocks(this);
        testInstance = new UserService(mockedDAO);
        //due to these two lines of code,
        //the user returned by the DAO will always be User u when given certain parameters
        when(mockedDAO.findByUsername("coolUsername")).thenReturn(u);
        when(mockedDAO.findById(1)).thenReturn(u);
    }

    @Test
    public void testLoginByNameSuccess() {
        //assert that a successful login returns the appropriate User.
        assertTrue(testInstance.loginWithName("coolUsername", "password").equals(u));

        //make sure that the findByUsername method of the UseDAO ran once (test fails if not)
        verify(mockedDAO, times(1)).findByUsername("coolUsername");
    }

    @Test
    public void testLoginByNameFail() {
        assertNull(testInstance.loginWithName("uncoolUsername", "password"));
    }

    @Test
    public void testSuccessfulLoginByNameDoesNotUseId(){

        //same assertion as in our first test
        assertTrue(testInstance.loginWithName("coolUsername", "password").equals(u));

        //because findById never actually rus here, this verification passes
        //yes, this could have just been lumped in with the first test
        verify(mockedDAO, never()).findById(1);
    }

    @Test
    public void testLoginFailsWithIncorrectPassword(){
        assertNull(testInstance.loginWithName("coolUsername", "notpassword"));

        //if you're just verifying a single test run, no need to add the second parameter!
        verify(mockedDAO).findByUsername("coolUsername");
    }

    @Test
    public void testLoginByIdSuccess() {
        assertTrue(testInstance.loginWithId(1, "password").equals(u));

        //make sure that the findById method of the UserDAO ran once (test fails if not)
        verify(mockedDAO, times(1)).findById(1);
    }

    @Test
    public void testLoginByIdFail() {
        assertNull(testInstance.loginWithId(2, "sassword"));
    }

    @Test
    public void testManagerIdReturnsManager(){
        assertEquals("Manager", testInstance.determineRole(1));
    }

    @Test
    public void testNonManagerIdReturnsEmployee(){
        assertEquals("Employee", testInstance.determineRole(20));
    }

    @Test
    public void testInvalidIdReturnNull(){
        assertNull(testInstance.determineRole(0));
        assertNull(testInstance.determineRole(-5));
        assertNull(testInstance.determineRole(-50));
    }

}