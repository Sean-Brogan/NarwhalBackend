package main.java.Repository;

import main.java.Classes.MedicalRecordTypes.Surgery;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SurgeryRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSurgeryById method, of class SurgeryRepository.
     */
    @Test
    public void testGetSurgeryById() {
        System.out.println("getSurgeryById");
        int recordId = 0;
        SurgeryRepository instance = new SurgeryRepository();
        Surgery expResult = null;
        Surgery result = instance.getSurgeryById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSurgeryRecord method, of class SurgeryRepository.
     */
    @Test
    public void testCreateSurgeryRecord() {
        System.out.println("createSurgeryRecord");
        Surgery record = null;
        SurgeryRepository instance = new SurgeryRepository();
        instance.createSurgeryRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
