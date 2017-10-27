package main.java.Classes;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class RecordAccessTest {  

    static int expNullInteger;
    static int expNonNullInteger;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        expNullInteger = 0;
        expNonNullInteger = 5;
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        expNullInteger  = 0;
        expNonNullInteger = 0;
        System.gc();
    }

    /**
     * Test of getRecordId method, of class RecordAccess.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        RecordAccess instance = new RecordAccess(5, 0);
        assertEquals(expNonNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class RecordAccess.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        RecordAccess instance = new RecordAccess(0, 0);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getUserId method, of class RecordAccess.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        RecordAccess instance = new RecordAccess(0, 5);
        assertEquals(expNonNullInteger, instance.getUserId());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUserId method, of class RecordAccess.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        RecordAccess instance = new RecordAccess(0, 0);
        instance.setUserId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getUserId() );
    }
    
}
