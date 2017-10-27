package main.java.Classes;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    
    static int expNullInteger;
    static int expNonNullInteger;
    static String descriptionString;
    static Date newDate;
    
    @BeforeClass
    public static void setUpClass() {
        expNullInteger = 0;
        expNonNullInteger = 5;
        descriptionString = "[v Description goes here. v]";
        newDate = new Date();
    }
    
    @AfterClass
    public static void tearDownClass() {
        expNullInteger  = 0;
        expNonNullInteger = 0;
        descriptionString = null;
        newDate = null;
        System.gc();
    }

    /**
     * Test of getUserId method, of class User.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        // NOTE: transactionId uses @GeneratedValue(strategy=GenerationType.IDENTITY).
        assertEquals(expNullInteger, instance.getUserId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUserId method, of class User.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setUserId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getUserId() );
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User(descriptionString, null, null, null, null, 0, false, null, 0);
        assertEquals(descriptionString, instance.getUsername() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setUsername(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getUsername() );
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User(null, descriptionString, null, null, null, 0, false, null, 0);
        assertEquals(descriptionString, instance.getPassword() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setPassword(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getPassword() );
    }

    /**
     * Test of getFirstname method, of class User.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        User instance = new User(null, null, descriptionString, null, null, 0, false, null, 0);
        assertEquals(descriptionString, instance.getFirstname() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFirstname method, of class User.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setFirstname(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getFirstname() );
    }

    /**
     * Test of getLastname method, of class User.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        User instance = new User(null, null, null, descriptionString, null, 0, false, null, 0);
        assertEquals(descriptionString, instance.getLastname() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLastname method, of class User.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setLastname(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getLastname() );
    }

    /**
     * Test of getDateOfBirth method, of class User.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        User instance = new User(null, null, null, null, newDate, 0, false, null, 0);
        assertEquals(newDate, instance.getDateOfBirth() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDateOfBirth method, of class User.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setDateOfBirth(newDate);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(newDate, instance.getDateOfBirth() );
    }

    /**
     * Test of getSSN method, of class User.
     */
    @Test
    public void testGetSSN() {
        System.out.println("getSSN");
        User instance = new User(null, null, null, null, null, 5, false, null, 0);
        assertEquals(expNonNullInteger, instance.getSSN() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSSN method, of class User.
     */
    @Test
    public void testSetSSN() {
        System.out.println("setSSN");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setSSN(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getSSN() );
    }

    /**
     * Test of getIsAlive method, of class User.
     */
    @Test
    public void testGetIsAlive() {
        System.out.println("getIsAlive");
        User instance = new User(null, null, null, null, null, 0, true, null, 0);
        assertEquals(true, instance.getIsAlive() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIsAlive method, of class User.
     */
    @Test
    public void testSetIsAlive() {
        System.out.println("setIsAlive");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setIsAlive(true);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.getIsAlive() );
    }

    /**
     * Test of getDOD method, of class User.
     */
    @Test
    public void testGetDOD() {
        System.out.println("getDOD");
        User instance = new User(null, null, null, null, null, 0, false, newDate, 0);
        assertEquals(newDate, instance.getDOD() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDateOfDeath method, of class User.
     */
    @Test
    public void testSetDateOfDeath() {
        System.out.println("setDateOfDeath");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setDateOfDeath(newDate);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(newDate, instance.getDOD() );
    }
    
    /**
     * Test of getPermissionLevel method, of class User.
     */
    @Test
    public void testGetPermissionLevel() {
        System.out.println("getPermissionLevel");
        User instance = new User(null, null, null, null, null, 0, false, null, 5);
        assertEquals(expNonNullInteger, instance.getPermissionLevel() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPermissionLevel method, of class User.
     */
    @Test
    public void testSetPermissionLevel() {
        System.out.println("setPermissionLevel");
        User instance = new User(null, null, null, null, null, 0, false, null, 0);
        instance.setPermissionLevel(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getPermissionLevel() );
    }    
}
