package main.java.Repository;

import main.java.Classes.ConditionType;
import main.java.Repository.Interfaces.IConditionTypeRepository;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionTypeRepositoryTest {
    
    public ConditionTypeRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getConditionTypeById method, of class ConditionTypeRepository.
     */
    @Test
    public void testGetConditionTypeById() {
        System.out.println("getConditionTypeById");
        int conditionTypeId = 0;
        IConditionTypeRepository instance = new ConditionTypeRepository();
        ConditionType expResult = null;
        ConditionType result = instance.getConditionTypeById(conditionTypeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createConditionType method, of class ConditionTypeRepository.
     */
    @Test
    public void testCreateConditionType() {
        System.out.println("createConditionType");
        ConditionType conditionType = null;
        ConditionTypeRepository instance = new ConditionTypeRepository();
        instance.createConditionType(conditionType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
