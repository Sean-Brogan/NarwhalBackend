package main.java.Classes.MedicalRecordTypes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SocialHistoryTest {
    
    static int expNullInteger;
    static int expNonNullInteger;
    
    @BeforeClass
    public static void setUpClass() {
        expNullInteger = 0;
        expNonNullInteger = 5;
    }
    
    @AfterClass
    public static void tearDownClass() {
        expNullInteger  = 0;
        expNonNullInteger = 0;
        System.gc();
    }

    /**
     * Test of getRecordId method, of class SocialHistory.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        SocialHistory instance = new SocialHistory(false, 0, false, 0);
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class SocialHistory.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        SocialHistory instance = new SocialHistory(false, 0, false, 0);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of isSmokes method, of class SocialHistory.
     */
    @Test
    public void testIsSmokes() {
        System.out.println("isSmokes");
        SocialHistory instance = new SocialHistory(true, 0, false, 0);
        assertEquals(true, instance.isSmokes() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSmokes method, of class SocialHistory.
     */
    @Test
    public void testSetSmokes() {
        System.out.println("setSmokes");
        SocialHistory instance = new SocialHistory(false, 0, false, 0);
        instance.setSmokes(true);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.isSmokes() );
    }

    /**
     * Test of getAmountSmokes method, of class SocialHistory.
     */
    @Test
    public void testGetAmountSmokes() {
        System.out.println("getAmountSmokes");
        SocialHistory instance = new SocialHistory(false, 5, false, 0);
        assertEquals(expNonNullInteger, instance.getAmountSmokes() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAmountSmokes method, of class SocialHistory.
     */
    @Test
    public void testSetAmountSmokes() {
        System.out.println("setAmountSmokes");
        SocialHistory instance = new SocialHistory(false, 0, false, 0);
        instance.setAmountSmokes(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getAmountSmokes() );
    }

    /**
     * Test of isDrinks method, of class SocialHistory.
     */
    @Test
    public void testIsDrinks() {
        System.out.println("isDrinks");
        SocialHistory instance = new SocialHistory(false, 0, true, 0);
        assertEquals(true, instance.isDrinks() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDrinks method, of class SocialHistory.
     */
    @Test
    public void testSetDrinks() {
        System.out.println("setDrinks");
        SocialHistory instance = new SocialHistory(false, 0, false, 0);
        instance.setDrinks(true);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.isDrinks() );
    }

    /**
     * Test of getAmountDrinks method, of class SocialHistory.
     */
    @Test
    public void testGetAmountDrinks() {
        System.out.println("getAmountDrinks");
        SocialHistory instance = new SocialHistory(false, 0, false, 5);
        assertEquals(expNonNullInteger, instance.getAmountDrinks() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAmountDrinks method, of class SocialHistory.
     */
    @Test
    public void testSetAmountDrinks() {
        System.out.println("setAmountDrinks");
        SocialHistory instance = new SocialHistory(false, 0, false, 0);
        instance.setAmountDrinks(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getAmountDrinks() );
    }
    
}
