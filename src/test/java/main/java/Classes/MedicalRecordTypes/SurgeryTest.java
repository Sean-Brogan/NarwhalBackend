package main.java.Classes.MedicalRecordTypes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SurgeryTest {
    
    static int expNullInteger;
    static int expNonNullInteger;
    static String descriptionString;
    
    @BeforeClass
    public static void setUpClass() {
        expNullInteger = 0;
        expNonNullInteger = 5;
        descriptionString = "[v Description goes here. v]";
    }
    
    @AfterClass
    public static void tearDownClass() {
        expNullInteger  = 0;
        expNonNullInteger = 0;
        descriptionString = null;
        System.gc();
    }

    /**
     * Test of getRecordId method, of class Surgery.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        Surgery instance = new Surgery(null, null);
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class Surgery.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        Surgery instance = new Surgery(null, null);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getSurgeryName method, of class Surgery.
     */
    @Test
    public void testGetSurgeryName() {
        System.out.println("getSurgeryName");
        Surgery instance = new Surgery(descriptionString, null);
        assertEquals(descriptionString, instance.getSurgeryName() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSurgeryName method, of class Surgery.
     */
    @Test
    public void testSetSurgeryName() {
        System.out.println("setSurgeryName");
        Surgery instance = new Surgery(null, null);
        instance.setSurgeryName(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getSurgeryName() );
    }

    /**
     * Test of getSurgeryResult method, of class Surgery.
     */
    @Test
    public void testGetSurgeryResult() {
        System.out.println("getSurgeryResult");
        Surgery instance = new Surgery(null, descriptionString);
        assertEquals(descriptionString, instance.getSurgeryResult() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSurgeryResult method, of class Surgery.
     */
    @Test
    public void testSetSurgeryResult() {
        System.out.println("setSurgeryResult");
        Surgery instance = new Surgery(null, null);
        instance.setSurgeryResult(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getSurgeryResult() );
    }
    
}
