package main.java.Repository;

import java.util.List;
import main.java.Classes.MedicalRecord;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicalRecordRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllMedicalRecords method, of class MedicalRecordRepository.
     */
    @Test
    public void testGetAllMedicalRecords() {
        System.out.println("getAllMedicalRecords");
        int id = 0;
        MedicalRecordRepository instance = new MedicalRecordRepository();
        List<MedicalRecord> expResult = null;
        List<MedicalRecord> result = instance.getAllMedicalRecords(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicalRecordById method, of class MedicalRecordRepository.
     */
    @Test
    public void testGetMedicalRecordById() {
        System.out.println("getMedicalRecordById");
        int recordId = 0;
        MedicalRecordRepository instance = new MedicalRecordRepository();
        MedicalRecord expResult = null;
        MedicalRecord result = instance.getMedicalRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicalRecord method, of class MedicalRecordRepository.
     */
    @Test
    public void testCreateMedicalRecord() {
        System.out.println("createMedicalRecord");
        MedicalRecord medicalRecord = null;
        MedicalRecordRepository instance = new MedicalRecordRepository();
        int expResult = 0;
        int result = instance.createMedicalRecord(medicalRecord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMedicalRecord method, of class MedicalRecordRepository.
     */
    @Test
    public void testUpdateMedicalRecord() {
        System.out.println("updateMedicalRecord");
        MedicalRecord medicalRecord = null;
        MedicalRecordRepository instance = new MedicalRecordRepository();
        instance.updateMedicalRecord(medicalRecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMedicalRecord method, of class MedicalRecordRepository.
     */
    @Test
    public void testDeleteMedicalRecord() {
        System.out.println("deleteMedicalRecord");
        int recordId = 0;
        MedicalRecordRepository instance = new MedicalRecordRepository();
        instance.deleteMedicalRecord(recordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
