package main.java.Classes.MedicalRecordTypes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmunizationTest {
    
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
     * Test of getRecordId method, of class Immunization.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        Immunization instance = new Immunization(null);
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class Immunization.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        Immunization instance = new Immunization(null);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
       assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getImmunization method, of class Immunization.
     */
    @Test
    public void testGetImmunization() {
        System.out.println("getImmunization");
        Immunization instance = new Immunization(descriptionString);
        assertEquals(descriptionString, instance.getImmunization() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setImmunization method, of class Immunization.
     */
    @Test
    public void testSetImmunization() {
        System.out.println("setImmunization");
        Immunization instance = new Immunization(null);
        instance.setImmunization(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getImmunization() );
    }
    
}
