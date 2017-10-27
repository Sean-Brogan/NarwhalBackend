package main.java.Classes;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {
    
    static int expNullInteger;
    static int expNonNullInteger;
    static String descriptionString;
    static Date newDate;
    
    @BeforeClass
    public static void setUpClass() {
        expNullInteger = 0;
        expNonNullInteger = 5;
        descriptionString = "[v Description goes here. v]";
        newDate = new Date();
    }
    
    @AfterClass
    public static void tearDownClass() {
        expNullInteger  = 0;
        expNonNullInteger = 0;
        descriptionString = null;
        newDate = null;
        System.gc();
    }

    /**
     * Test of getTransactionId method, of class Transaction.
     */
    @Test
    public void testGetTransactionId() {
        System.out.println("getTransactionId");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        // NOTE: transactionId uses @GeneratedValue(strategy=GenerationType.AUTO).
        assertEquals(expNullInteger, instance.getTransactionId());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTransactionId method, of class Transaction.
     */
    @Test
    public void testSetTransactionId() {
        System.out.println("setTransactionId");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setTransactionId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getTransactionId());
    }

    /**
     * Test of getPatientId method, of class Transaction.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Transaction instance = new Transaction(5, 0, null, null, null, 0, null);
        assertEquals(expNonNullInteger, instance.getPatientId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPatientId method, of class Transaction.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setPatientId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getPatientId() );
    }

    /**
     * Test of getRecordId method, of class Transaction.
     */
    @Test
    public void testGetRecordId() {
        System.out.println("getRecordId");
        Transaction instance = new Transaction(0, 5, null, null, null, 0, null);
        assertEquals(expNonNullInteger, instance.getRecordId() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordId method, of class Transaction.
     */
    @Test
    public void testSetRecordId() {
        System.out.println("setRecordId");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setRecordId(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getRecordId() );
    }

    /**
     * Test of getRecordDate method, of class Transaction.
     */
    @Test
    public void testGetRecordDate() {
        System.out.println("getRecordDate");
        Transaction instance = new Transaction(0, 0, newDate, null, null, 0, null);
        assertEquals(newDate, instance.getRecordDate() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRecordDate method, of class Transaction.
     */
    @Test
    public void testSetRecordDate() {
        System.out.println("setRecordDate");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setRecordDate(newDate);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(newDate, instance.getRecordDate() );
    }

    /**
     * Test of getPaymentSource method, of class Transaction.
     */
    @Test
    public void testGetPaymentSource() {
        System.out.println("getPaymentSource");
        Transaction instance = new Transaction(0, 0, null, descriptionString, null, 0, null);
        assertEquals(descriptionString, instance.getPaymentSource() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPaymentSource method, of class Transaction.
     */
    @Test
    public void testSetPaymentSource() {
        System.out.println("setPaymentSource");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setPaymentSource(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getPaymentSource() );
    }

    /**
     * Test of getPaymentDestination method, of class Transaction.
     */
    @Test
    public void testGetPaymentDestination() {
        System.out.println("getPaymentDestination");
        Transaction instance = new Transaction(0, 0, null, null, descriptionString, 0, null);
        assertEquals(descriptionString, instance.getPaymentDestination() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPaymentDestination method, of class Transaction.
     */
    @Test
    public void testSetPaymentDestination() {
        System.out.println("setPaymentDestination");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setPaymentDestination(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getPaymentDestination() );
    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transaction instance = new Transaction(0, 0, null, null, null, 5, null);
        assertEquals(expNonNullInteger, instance.getAmount() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAmount method, of class Transaction.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setAmount(expNonNullInteger);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expNonNullInteger, instance.getAmount() );
    }

    /**
     * Test of getCurrency method, of class Transaction.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, descriptionString);
        assertEquals(descriptionString, instance.getCurrency() );
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCurrency method, of class Transaction.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Transaction instance = new Transaction(0, 0, null, null, null, 0, null);
        instance.setCurrency(descriptionString);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(descriptionString, instance.getCurrency() );
    }
    
}
