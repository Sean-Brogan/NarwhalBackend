package main.java.Repository;

import main.java.Classes.MedicalRecordTypes.Diagnosis;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiagnosisRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDiagnosisById method, of class DiagnosisRepository.
     */
    @Test
    public void testGetDiagnosisById() {
        System.out.println("getDiagnosisById");
        int recordId = 0;
        DiagnosisRepository instance = new DiagnosisRepository();
        Diagnosis expResult = null;
        Diagnosis result = instance.getDiagnosisById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDiagnosisRecord method, of class DiagnosisRepository.
     */
    @Test
    public void testCreateDiagnosisRecord() {
        System.out.println("createDiagnosisRecord");
        Diagnosis record = null;
        DiagnosisRepository instance = new DiagnosisRepository();
        instance.createDiagnosisRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
