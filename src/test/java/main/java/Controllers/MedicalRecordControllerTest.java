package main.java.Controllers;

import java.util.List;
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

// NOTE: These tests are correlated using the Spring.io response frameworks
//       For now these Tests will all Fail and considered prototypes. Until we can get a confirming side 
//       on the Front-End until it can and  needs to make requests for these functions/methods.
public class MedicalRecordControllerTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllMedicalRecords method, of class MedicalRecordController.
     */
    @Test
    public void testGetAllMedicalRecords() {
        System.out.println("getAllMedicalRecords");
        String id = "1";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<List<MedicalRecord>> expResult = null;
        ResponseEntity<List<MedicalRecord>> result = instance.getAllMedicalRecords(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnosisRecord method, of class MedicalRecordController.
     */
    @Test
    public void testGetDiagnosisRecord() {
        System.out.println("getDiagnosisRecord");
        String id = "";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Diagnosis> expResult = null;
        ResponseEntity<Diagnosis> result = instance.getDiagnosisRecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImmunizationRecord method, of class MedicalRecordController.
     */
    @Test
    public void testGetImmunizationRecord() {
        System.out.println("getImmunizationRecord");
        String id = "";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Immunization> expResult = null;
        ResponseEntity<Immunization> result = instance.getImmunizationRecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicalTestRecord method, of class MedicalRecordController.
     */
    @Test
    public void testGetMedicalTestRecord() {
        System.out.println("getMedicalTestRecord");
        String id = "";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<MedicalTest> expResult = null;
        ResponseEntity<MedicalTest> result = instance.getMedicalTestRecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicationRecord method, of class MedicalRecordController.
     */
    @Test
    public void testGetMedicationRecord() {
        System.out.println("getMedicationRecord");
        String id = "";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Medication> expResult = null;
        ResponseEntity<Medication> result = instance.getMedicationRecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSocialHistoryRecord method, of class MedicalRecordController.
     */
    @Test
    public void testGetSocialHistoryRecord() {
        System.out.println("getSocialHistoryRecord");
        String id = "";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<SocialHistory> expResult = null;
        ResponseEntity<SocialHistory> result = instance.getSocialHistoryRecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurgeryRecord method, of class MedicalRecordController.
     */
    @Test
    public void testGetSurgeryRecord() {
        System.out.println("getSurgeryRecord");
        String id = "";
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Surgery> expResult = null;
        ResponseEntity<Surgery> result = instance.getSurgeryRecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicalRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateMedicalRecord() {
        System.out.println("createMedicalRecord");
        MedicalRecord record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Integer> expResult = null;
        ResponseEntity<Integer> result = instance.createMedicalRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDiagnosisRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateDiagnosisRecord() {
        System.out.println("createDiagnosisRecord");
        Diagnosis record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createDiagnosisRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createImmunizationRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateImmunizationRecord() {
        System.out.println("createImmunizationRecord");
        Immunization record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createImmunizationRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicalTestRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateMedicalTestRecord() {
        System.out.println("createMedicalTestRecord");
        MedicalTest record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createMedicalTestRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicationRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateMedicationRecord() {
        System.out.println("createMedicationRecord");
        Medication record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createMedicationRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocialHistoryRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateSocialHistoryRecord() {
        System.out.println("createSocialHistoryRecord");
        SocialHistory record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createSocialHistoryRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSurgeryRecord method, of class MedicalRecordController.
     */
    @Test
    public void testCreateSurgeryRecord() {
        System.out.println("createSurgeryRecord");
        Surgery record = null;
        MedicalRecordController instance = new MedicalRecordController();
        ResponseEntity<Void> expResult = null;
        ResponseEntity<Void> result = instance.createSurgeryRecord(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
