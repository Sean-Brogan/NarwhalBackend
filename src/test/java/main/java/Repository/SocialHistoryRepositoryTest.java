package main.java.Repository;

import main.java.Classes.MedicalRecordTypes.SocialHistory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SocialHistoryRepositoryTest {
    
    public SocialHistoryRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSocialHistoryById method, of class SocialHistoryRepository.
     */
    @Test
    public void testGetSocialHistoryById() {
        System.out.println("getSocialHistoryById");
        int recordId = 0;
        SocialHistoryRepository instance = new SocialHistoryRepository();
        SocialHistory expResult = null;
        SocialHistory result = instance.getSocialHistoryById(recordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocialHistoryRecord method, of class SocialHistoryRepository.
     */
    @Test
    public void testCreateSocialHistoryRecord() {
        System.out.println("createSocialHistoryRecord");
        SocialHistory record = null;
        SocialHistoryRepository instance = new SocialHistoryRepository();
        instance.createSocialHistoryRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
