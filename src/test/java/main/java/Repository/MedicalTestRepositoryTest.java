package main.java.Repository;

import main.java.Classes.MedicalRecordTypes.MedicalTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicalTestRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMedicalTestById method, of class MedicalTestRepository.
     */
    @Test
    public void testGetMedicalTestById() {
        System.out.println("getMedicalTestById");
        int recordId = 0;
        MedicalTestRepository instance = new MedicalTestRepository();
        MedicalTest expResult = null;
        MedicalTest result = instance.getMedicalTestById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicalTestRecord method, of class MedicalTestRepository.
     */
    @Test
    public void testCreateMedicalTestRecord() {
        System.out.println("createMedicalTestRecord");
        MedicalTest record = null;
        MedicalTestRepository instance = new MedicalTestRepository();
        instance.createMedicalTestRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
