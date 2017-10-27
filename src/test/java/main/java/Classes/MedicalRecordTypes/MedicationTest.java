package main.java.Classes.MedicalRecordTypes;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicationTest {
    
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
     * Test of getRecordId method, of class Medication.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        Medication instance = new Medication(null, null, 0, null, null);
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class Medication.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        Medication instance = new Medication(null, null, 0, null, null);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getMedicationName method, of class Medication.
     */
    @Test
    public void testGetMedicationName() {
        System.out.println("getMedicationName");
        Medication instance = new Medication(descriptionString, null, 0, null, null);
        assertEquals(descriptionString, instance.getMedicationName() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMedicationName method, of class Medication.
     */
    @Test
    public void testSetMedicationName() {
        System.out.println("setMedicationName");
        Medication instance = new Medication(null, null, 0, null, null);
        instance.setMedicationName(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getMedicationName() );
    }
    
    /**
     * Test of getFrequency method, of class Medication.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Medication instance = new Medication(null, descriptionString, 0, null, null);
        assertEquals(descriptionString, instance.getFrequency() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFrequency method, of class Medication.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        Medication instance = new Medication(null, null, 0, null, null);
        instance.setFrequency(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getFrequency() );
    }

    /**
     * Test of getDosage method, of class Medication.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Medication instance = new Medication(null, null, 5, null, null);
        assertEquals(expNonNullInteger, instance.getDosage() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDosage method, of class Medication.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        Medication instance = new Medication(null, null, 0, null, null);
        instance.setDosage(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getDosage() );
    }

    /**
     * Test of getDeliveryMethod method, of class Medication.
     */
    @Test
    public void testGetDeliveryMethod() {
        System.out.println("getDeliveryMethod");
        Medication instance = new Medication(null, null, 0, descriptionString, null);
        assertEquals(descriptionString, instance.getDeliveryMethod() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDeliveryMethod method, of class Medication.
     */
    @Test
    public void testSetDeliveryMethod() {
        System.out.println("setDeliveryMethod");
        Medication instance = new Medication(null, null, 0, null, null);
        instance.setDeliveryMethod(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getDeliveryMethod() );
    }

    /**
     * Test of getExperationDate method, of class Medication.
     */
    @Test
    public void testGetExperationDate() {
        System.out.println("getExperationDate");
        Medication instance = new Medication(null, null, 0, null, newDate);
        assertEquals(newDate, instance.getExperationDate() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setExperationDate method, of class Medication.
     */
    @Test
    public void testSetExperationDate() {
        System.out.println("setExperationDate");
        Medication instance = new Medication(null, null, 0, null, null);
        instance.setExperationDate(newDate);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(newDate, instance.getExperationDate() );
    }
}
