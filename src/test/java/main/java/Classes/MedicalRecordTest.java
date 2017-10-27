package main.java.Classes;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicalRecordTest {
    
    static int expNullInteger;
    static int expNonNullInteger;
    static Date newDate;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        expNullInteger = 0;
        expNonNullInteger = 5;
        newDate = new Date();
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        expNullInteger  = 0;
        expNonNullInteger = 0;
        newDate = null;
        System.gc();
    }

    /**
     * Test of getRecordId method, of class MedicalRecord.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        MedicalRecord instance = new MedicalRecord(0, 0, 0, null);
        // NOTE: conditionId uses @GeneratedValue(strategy=GenerationType.AUTO). Expected value should be null on create.
        //       but will increment its value upon its insertion into the Database
        assertEquals(expNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPatientId method, of class MedicalRecord.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        MedicalRecord instance = new MedicalRecord(5, 0, 0, null);
        assertEquals(expNonNullInteger, instance.getPatientId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPatientId method, of class MedicalRecord.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        MedicalRecord instance = new MedicalRecord(0, 0, 0, null);
        instance.setPatientId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getPatientId() );
    }

    /**
     * Test of getDoctorId method, of class MedicalRecord.
     */
    @Test
    public void testGetDoctorId() {
        System.out.println("getDoctorId");
        MedicalRecord instance = new MedicalRecord(0, 5, 0, null);
        assertEquals(expNonNullInteger, instance.getDoctorId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDoctorId method, of class MedicalRecord.
     */
    @Test
    public void testSetDoctorId() {
        System.out.println("setDoctorId");
        MedicalRecord instance = new MedicalRecord(0, 0, 0, null);
        instance.setDoctorId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getDoctorId() );
    }

    /**
     * Test of getRecordTypeId method, of class MedicalRecord.
     */
    @Test
    public void testGetRecordTypeId() {
        System.out.println("getRecordTypeId");
        MedicalRecord instance = new MedicalRecord(0, 0, 5, null);
        assertEquals(expNonNullInteger, instance.getRecordTypeId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordTypeId method, of class MedicalRecord.
     */
    @Test
    public void testSetRecordTypeId() {
        System.out.println("setRecordTypeId");
        MedicalRecord instance = new MedicalRecord(0, 0, 0, null);
        instance.setRecordTypeId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordTypeId() );
    }

    /**
     * Test of getRecordDate method, of class MedicalRecord.
     */
    @Test
    public void testGetRecordDate() {
        System.out.println("getRecordDate");
        MedicalRecord instance = new MedicalRecord(0, 0, 0, newDate);
        assertEquals(newDate, instance.getRecordDate() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordDate method, of class MedicalRecord.
     */
    @Test
    public void testSetRecordDate() {
        System.out.println("setRecordDate");
        MedicalRecord instance = new MedicalRecord();
        instance.setRecordDate(newDate);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(newDate, instance.getRecordDate() );
    }
    
}
