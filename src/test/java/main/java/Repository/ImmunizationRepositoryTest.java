package main.java.Repository;

import main.java.Classes.MedicalRecordTypes.Immunization;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmunizationRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getImmunizationById method, of class ImmunizationRepository.
     */
    @Test
    public void testGetImmunizationById() {
        System.out.println("getImmunizationById");
        int recordId = 0;
        ImmunizationRepository instance = new ImmunizationRepository();
        Immunization expResult = null;
        Immunization result = instance.getImmunizationById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createImmunizationRecord method, of class ImmunizationRepository.
     */
    @Test
    public void testCreateImmunizationRecord() {
        System.out.println("createImmunizationRecord");
        Immunization record = null;
        ImmunizationRepository instance = new ImmunizationRepository();
        instance.createImmunizationRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
