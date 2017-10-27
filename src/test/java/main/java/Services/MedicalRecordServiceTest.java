package main.java.Services;

import java.util.List;
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;


//import main.java.Repository.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicalRecordServiceTest {
    
//    private static UserRepository userRepository;
//    private static ConditionTypeRepository conditionTypeRepository;
//    private static MedicalRecordRepository medicalRecordRepository;
//    private static DiagnosisRepository diagnosisRepository;
//    private static ImmunizationRepository immunizationRepository;
//    private static MedicalTestRepository medicalTestRepository;
//    private static MedicationRepository medicationRepository;
//    private static SocialHistoryRepository socialHistoryRepository;
//    private static SurgeryRepository surgeryRepository;
    
    @BeforeClass
    public static void setUpClass() {
//        userRepository = new UserRepository();
//        conditionTypeRepository = new ConditionTypeRepository();
//        medicalRecordRepository = new MedicalRecordRepository();
//        diagnosisRepository = new DiagnosisRepository();
//        immunizationRepository = new ImmunizationRepository();
//        medicalTestRepository = new MedicalTestRepository();
//        medicationRepository = new MedicationRepository();
//        socialHistoryRepository = new SocialHistoryRepository();
//        surgeryRepository = new SurgeryRepository();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllMedicalRecords method, of class MedicalRecordService.
     */
    @Test
    public void testGetAllMedicalRecords() {
        System.out.println("getAllMedicalRecords");
        int id = 0;
        MedicalRecordService instance = new MedicalRecordService();
        List<MedicalRecord> expResult = null;
        List<MedicalRecord> result = instance.getAllMedicalRecords(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicalRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetMedicalRecordById() {
        System.out.println("getMedicalRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        MedicalRecord expResult = null;
        MedicalRecord result = instance.getMedicalRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicalRecord method, of class MedicalRecordService.
     */
    @Test
    public void testCreateMedicalRecord() {
        System.out.println("createMedicalRecord");
        MedicalRecord medicalRecord = null;
        MedicalRecordService instance = new MedicalRecordService();
        int expResult = 0;
        int result = instance.createMedicalRecord(medicalRecord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMedicalRecord method, of class MedicalRecordService.
     */
    @Test
    public void testUpdateMedicalRecord() {
        System.out.println("updateMedicalRecord");
        MedicalRecord medicalRecord = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.updateMedicalRecord(medicalRecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMedicalRecord method, of class MedicalRecordService.
     */
    @Test
    public void testDeleteMedicalRecord() {
        System.out.println("deleteMedicalRecord");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        instance.deleteMedicalRecord(recordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnosisRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetDiagnosisRecordById() {
        System.out.println("getDiagnosisRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        Diagnosis expResult = null;
        Diagnosis result = instance.getDiagnosisRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDiagnosisRecord method, of class MedicalRecordService.
     */
    @Test
    public void testCreateDiagnosisRecord() {
        System.out.println("createDiagnosisRecord");
        Diagnosis record = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.createDiagnosisRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImmunizationRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetImmunizationRecordById() {
        System.out.println("getImmunizationRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        Immunization expResult = null;
        Immunization result = instance.getImmunizationRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createImmunizationRecord method, of class MedicalRecordService.
     */
    @Test
    public void testCreateImmunizationRecord() {
        System.out.println("createImmunizationRecord");
        Immunization record = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.createImmunizationRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicalTestRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetMedicalTestRecordById() {
        System.out.println("getMedicalTestRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        MedicalTest expResult = null;
        MedicalTest result = instance.getMedicalTestRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicalTest method, of class MedicalRecordService.
     */
    @Test
    public void testCreateMedicalTest() {
        System.out.println("createMedicalTest");
        MedicalTest record = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.createMedicalTest(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicationRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetMedicationRecordById() {
        System.out.println("getMedicationRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        Medication expResult = null;
        Medication result = instance.getMedicationRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedicationRecord method, of class MedicalRecordService.
     */
    @Test
    public void testCreateMedicationRecord() {
        System.out.println("createMedicationRecord");
        Medication record = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.createMedicationRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSocialHistoryTestRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetSocialHistoryTestRecordById() {
        System.out.println("getSocialHistoryTestRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        SocialHistory expResult = null;
        SocialHistory result = instance.getSocialHistoryTestRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocialHistory method, of class MedicalRecordService.
     */
    @Test
    public void testCreateSocialHistory() {
        System.out.println("createSocialHistory");
        SocialHistory record = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.createSocialHistory(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurgeryRecordById method, of class MedicalRecordService.
     */
    @Test
    public void testGetSurgeryRecordById() {
        System.out.println("getSurgeryRecordById");
        int recordId = 0;
        MedicalRecordService instance = new MedicalRecordService();
        Surgery expResult = null;
        Surgery result = instance.getSurgeryRecordById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSurgeryRecord method, of class MedicalRecordService.
     */
    @Test
    public void testCreateSurgeryRecord() {
        System.out.println("createSurgeryRecord");
        Surgery record = null;
        MedicalRecordService instance = new MedicalRecordService();
        instance.createSurgeryRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
