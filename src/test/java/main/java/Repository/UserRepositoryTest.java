package main.java.Repository;

import java.util.List;
import main.java.Classes.User;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllUsers method, of class UserRepository.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserRepository instance = new UserRepository();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserRepository.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int userId = 0;
        UserRepository instance = new UserRepository();
        User expResult = null;
        User result = instance.getUserById(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class UserRepository.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = null;
        UserRepository instance = new UserRepository();
        instance.createUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserRepository.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserRepository instance = new UserRepository();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserRepository.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int userId = 0;
        UserRepository instance = new UserRepository();
        instance.deleteUser(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginExists method, of class UserRepository.
     */
    @Test
    public void testLoginExists() {
        System.out.println("loginExists");
        String username = "";
        String password = "";
        UserRepository instance = new UserRepository();
        boolean expResult = false;
        boolean result = instance.loginExists(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserWithLogin method, of class UserRepository.
     */
    @Test
    public void testGetUserWithLogin() {
        System.out.println("getUserWithLogin");
        String username = "";
        String password = "";
        UserRepository instance = new UserRepository();
        User expResult = null;
        User result = instance.getUserWithLogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
