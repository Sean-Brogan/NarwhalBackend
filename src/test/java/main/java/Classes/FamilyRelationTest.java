package main.java.Classes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FamilyRelationTest {
    
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
     * Test of getPatientId method, of class FamilyRelation.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        FamilyRelation instance = new FamilyRelation(5, 0, null);
        assertEquals(expNonNullInteger, instance.getPatientId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPatientId method, of class FamilyRelation.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        FamilyRelation instance = new FamilyRelation(0, 0, null);
        instance.setPatientId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getPatientId() );
    }

    /**
     * Test of getRelationId method, of class FamilyRelation.
     */
    @Test
    public void testGetRelationId() {
        System.out.println("getRelationId");
        FamilyRelation instance = new FamilyRelation(0, 5, null);
        assertEquals(expNonNullInteger, instance.getRelationId());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRelationId method, of class FamilyRelation.
     */
    @Test
    public void testSetRelationId() {
        System.out.println("setRelationId");
        FamilyRelation instance = new FamilyRelation(0, 0, null);
        instance.setRelationId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRelationId());
    }

    /**
     * Test of getRelation method, of class FamilyRelation.
     */
    @Test
    public void testGetRelation() {
        System.out.println("getRelation");
        FamilyRelation instance = new FamilyRelation(0, 0, descriptionString);
        assertEquals(descriptionString, instance.getRelation() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRelation method, of class FamilyRelation.
     */
    @Test
    public void testSetRelation() {
        System.out.println("setRelation");
        FamilyRelation instance = new FamilyRelation(0, 0, null);
        instance.setRelation(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getRelation() );
    }
    
}
