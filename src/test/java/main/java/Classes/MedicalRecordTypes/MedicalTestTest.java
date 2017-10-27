package main.java.Classes.MedicalRecordTypes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicalTestTest {
    
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
     * Test of getRecordId method, of class MedicalTest.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        MedicalTest instance = new MedicalTest(null, null);
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class MedicalTest.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        MedicalTest instance = new MedicalTest(null, null);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getTestName method, of class MedicalTest.
     */
    @Test
    public void testGetTestName() {
        System.out.println("getTestName");
        MedicalTest instance = new MedicalTest(descriptionString, null);
        assertEquals(descriptionString, instance.getTestName() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTestName method, of class MedicalTest.
     */
    @Test
    public void testSetTestName() {
        System.out.println("setTestName");
        MedicalTest instance = new MedicalTest(null, null);
        instance.setTestName(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getTestName() );
    }

    /**
     * Test of getTestResult method, of class MedicalTest.
     */
    @Test
    public void testGetTestResult() {
        System.out.println("getTestResult");
        MedicalTest instance = new MedicalTest(null, descriptionString);
        assertEquals(descriptionString, instance.getTestResult() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTestResult method, of class MedicalTest.
     */
    @Test
    public void testSetTestResult() {
        System.out.println("setTestResult");
        MedicalTest instance = new MedicalTest(null, null);
        instance.setTestResult(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getTestResult() );
    }
    
}
