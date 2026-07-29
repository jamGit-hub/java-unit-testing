/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package countpositive;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RAGHA
 */
public class CountPositiveTest {
    
    public CountPositiveTest() {
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
 @Test
    public void testCountPositiveWithMixedValues() {
        int[] x = {-4, 2, 0, 2};
        int result = CountPositive.countPositive(x);
        assertEquals(2, result);
    }
    
    @Test
    public void testCountPositiveNegativenum() {
        int[] x = {-5, -3, -10};
        int result = CountPositive.countPositive(x);
        assertEquals(0, result);
    }

    @Test
    public void testCountPositivePositivenum() {
        int[] x = {1, 5, 9};
        int result = CountPositive.countPositive(x);
        assertEquals(3, result);
    }

    @Test(expected = NullPointerException.class)
    public void testCountPositiveNullArray() {
        CountPositive.countPositive(null);
    }
}