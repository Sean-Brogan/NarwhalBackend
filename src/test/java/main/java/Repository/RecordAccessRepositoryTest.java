package main.java.Repository;

import java.util.List;
import main.java.Classes.RecordAccess;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RecordAccessRepositoryTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createRecordAccess method, of class RecordAccessRepository.
     */
    @Test
    public void testCreateRecordAccess() {
        System.out.println("createRecordAccess");
        RecordAccess recordAccess = null;
        RecordAccessRepository instance = new RecordAccessRepository();
        instance.createRecordAccess(recordAccess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRecordAccess method, of class RecordAccessRepository.
     */
    @Test
    public void testDeleteRecordAccess() {
        System.out.println("deleteRecordAccess");
        RecordAccess recordAccess = null;
        RecordAccessRepository instance = new RecordAccessRepository();
        instance.deleteRecordAccess(recordAccess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordsUserCanAccess method, of class RecordAccessRepository.
     */
    @Test
    public void testRecordsUserCanAccess() {
        System.out.println("recordsUserCanAccess");
        int userId = 0;
        RecordAccessRepository instance = new RecordAccessRepository();
        List expResult = null;
        List result = instance.recordsUserCanAccess(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
