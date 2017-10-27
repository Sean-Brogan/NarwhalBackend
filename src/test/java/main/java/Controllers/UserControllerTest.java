package main.java.Controllers;

import java.util.List;
import java.util.Map;
import main.java.Classes.User;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

// NOTE: These tests are correlated using the Spring.io response frameworks
//       For now these Tests will all Fail and considered prototypes. Until we can get a confirming side 
//       on the Front-End it both possible and  needs to make requests for these functions/methods.
public class UserControllerTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllUsers method, of class UserController.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserController instance = new UserController();
        ResponseEntity<List<User>> expResult = null;
        ResponseEntity<List<User>> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserController.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        String id = "";
        UserController instance = new UserController();
        ResponseEntity<User> expResult = null;
        ResponseEntity<User> result = instance.getUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class UserController.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = new User(null, null, null, null, null, 0, false, null, 0);
        UriComponentsBuilder builder = null;
        UserController instance = new UserController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createUser(user, builder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserController.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserController instance = new UserController();
        ResponseEntity<User> expResult = null;
        ResponseEntity<User> result = instance.updateUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserController.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        String id = "";
        UserController instance = new UserController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.deleteUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginVerify method, of class UserController.
     */
    @Test
    public void testLoginVerify() {
        System.out.println("loginVerify");
        Map<String, String> requestParams = null;
        UserController instance = new UserController();
        ResponseEntity<User> expResult = null;
        ResponseEntity<User> result = instance.loginVerify(requestParams);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
