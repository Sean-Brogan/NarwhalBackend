package main.java.Classes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionTypeTest {
    
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
     * Test of getConditionId method, of class ConditionType.
     */
    @Test
    public void testGetConditionId() {
        System.out.println("getConditionId");
        ConditionType instance = new ConditionType(null);
        // NOTE: RecordId uses @GeneratedValue(strategy=GenerationType.IDENTITY).
        assertEquals(expNullInteger, instance.getConditionId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getConditionName method, of class ConditionType.
     */
    @Test
    public void testGetConditionName() {
        System.out.println("getConditionName");
        ConditionType instance = new ConditionType(descriptionString);
        assertEquals(descriptionString, instance.getConditionName() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setConditionName method, of class ConditionType.
     */
    @Test
    public void testSetConditionName() {
        System.out.println("setConditionName");
        ConditionType instance = new ConditionType(null);
        instance.setConditionName(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getConditionName());
    }
    
}
