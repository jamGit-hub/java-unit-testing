/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.oddorpos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author unik
 */
/*
test cases: 
1- positive and negative array
2- all positive even
3- all negative odd
4- empty array
5- x =0 , NullPointerException
*/
public class OddorPosTest {

    @Test
    public void testPositiveAndNegative() {
        int a[] = {-3, -2, 0, 1, 4};
        int result = OddorPos.oddOrPos(a);
        assertEquals(3,result);
    } 
    @Test
    public void testPositiveEven() {
        int a[] = {2, 4, 8, 10, 16};
        int result = OddorPos.oddOrPos(a);
        assertEquals(5,result);
    } //passed 
    
    
    @Test
    public void testNegativeOdd() {
        int a[] = {-3, -7, -9, -15};
        int result = OddorPos.oddOrPos(a);
        assertEquals(4,result);
    }
    
    @Test
    public void testEmptyArray() {
        int a[] = {};
        int result = OddorPos.oddOrPos(a);
        assertEquals(0,result);
    }
     @Test 
    public void testNullPointerException() {
        assertThrows(NullPointerException.class, () -> OddorPos.oddOrPos(null));
 
    }
    
    
}
