/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graycell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jagdish
 */
public class CurrencyIT {
    
    public CurrencyIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toWord method, of class Currency.
     */
    @Test(timeout=1000)
    public void testToWord() {
        System.out.println("toWord");
        float currencys = 0.0F;
        String expResult = "";
        String result = Currency.toWord(currencys);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDigit method, of class Currency.
     */
    @Test
    public void testGetDigit() {
        System.out.println("getDigit");
        int i = 0;
        String expResult = "";
        String result = Currency.getDigit(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
