package main.java.Services;

import java.util.List;
import main.java.Classes.User;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllUsers method, of class UserService.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserService.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int userId = 0;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.getUserById(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class UserService.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = null;
        UserService instance = new UserService();
        boolean expResult = false;
        boolean result = instance.createUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserService.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserService instance = new UserService();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserService.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int userId = 0;
        UserService instance = new UserService();
        instance.deleteUser(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyLogin method, of class UserService.
     */
    @Test
    public void testVerifyLogin() {
        System.out.println("verifyLogin");
        String username = "";
        String password = "";
        UserService instance = new UserService();
        boolean expResult = false;
        boolean result = instance.verifyLogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserWithLogin method, of class UserService.
     */
    @Test
    public void testGetUserWithLogin() {
        System.out.println("getUserWithLogin");
        String username = "";
        String password = "";
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.getUserWithLogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
