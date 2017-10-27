package main.java.Classes.MedicalRecordTypes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiagnosisTest {
    
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
     * Test of getRecordId method, of class Diagnosis.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        Diagnosis instance = new Diagnosis(null, null);
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class Diagnosis.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        Diagnosis instance = new Diagnosis(null, null);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getDiagnosis method, of class Diagnosis.
     */
    @Test
    public void testGetDiagnosis() {
        System.out.println("getDiagnosis");
        Diagnosis instance = new Diagnosis(descriptionString, null);
        assertEquals(descriptionString, instance.getDiagnosis() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDiagnosis method, of class Diagnosis.
     */
    @Test
    public void testSetDiagnosis() {
        System.out.println("setDiagnosis");
        Diagnosis instance = new Diagnosis(null, null);
        instance.setDiagnosis(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getDiagnosis() );
    }

    /**
     * Test of getDiagnosisDetails method, of class Diagnosis.
     */
    @Test
    public void testGetDiagnosisDetails() {
        System.out.println("getDiagnosisDetails");
        Diagnosis instance = new Diagnosis(null, descriptionString);
        assertEquals(descriptionString, instance.getDiagnosisDetails() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDiagnosisDetails method, of class Diagnosis.
     */
    @Test
    public void testSetDiagnosisDetails() {
        System.out.println("setDiagnosisDetails");
        Diagnosis instance = new Diagnosis(null, null);
        instance.setDiagnosisDetails(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getDiagnosisDetails() );
    }
    
}
