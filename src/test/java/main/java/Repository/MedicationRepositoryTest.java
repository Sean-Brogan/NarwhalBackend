package main.java.Repository;

import main.java.Classes.MedicalRecordTypes.Medication;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicationRepositoryTest {
    
    public MedicationRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMedicationById method, of class MedicationRepository.
     */
    @Test
    public void testGetMedicationById() {
        System.out.println("getMedicationById");
        int recordId = 0;
        MedicationRepository instance = new MedicationRepository();
        Medication expResult = null;
        Medication result = instance.getMedicationById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicationRecord method, of class MedicationRepository.
     */
    @Test
    public void testCreateMedicationRecord() {
        System.out.println("createMedicationRecord");
        Medication record = null;
        MedicationRepository instance = new MedicationRepository();
        instance.createMedicationRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
