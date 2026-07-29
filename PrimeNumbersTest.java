/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.primenumbers;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author unik
 */
/* 
(a) A test that does not reach the fault
(b) A test that reaches the fault, but does not infect
(c) A test that infects the state, but does not propagate
(d) A test that propagates, but does not reveal 
(e) A test that reveals the fault If a test cannot be created, explain why.
*/

// fault is in condition: 
// if(isPrime && (number %10 !=9) ) >> this condition excludes all primes ending with digit 9. 

public class PrimeNumbersTest {
     //convert Iterable<Integer> to List<Integer>
    private List<Integer> toList(Iterable<Integer> iterable) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : iterable) {
            list.add(i);
        }
        return list;
    }
    // prime checker used in test (d)
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


// a : test number that are all prime so that the loop will break before the faulty condition
    // primes found before hitting any prime ending with 9
    @Test
    public void testDoesNotReachFault() {
      PrimeNumbers p = new PrimeNumbers();
        p.computePrimes(3); 
        List<Integer> expected = Arrays.asList(2, 3, 5);
        assertEquals(expected, toList(p)); 
       
    }
    
 //b : the fault condition must be evaluated to be true
    //Prime 7 reached → (7 % 10 != 9) → condition evaluates, but fault not triggered
    @Test
    public void testDoesNotInfect() {
        PrimeNumbers p = new PrimeNumbers();
        p.computePrimes(4); 
        List<Integer> expected = Arrays.asList(2, 3, 5,7);
        assertEquals(expected, toList(p));
        
    }
    
  //c: skips adding a legitimate prime like 19,
    // 19 is skipped, but if only the size is checked, the difference is hidden
    @Test
    public void testDoesNotPropagate() {
        PrimeNumbers p = new PrimeNumbers();
        p.computePrimes(8); 
       
        assertEquals(8, toList(p).size());
  
        
    }
    
  //d: state difference shows up in the output.the test oracle doesn’t check carefully enough it doesn’t notice the difference.
    //check "last is prime"
   @Test
    public void testPropagates() {
      PrimeNumbers p = new PrimeNumbers();
        p.computePrimes(8);
        List<Integer> r = toList(p);
        int last = r.get(r.size() - 1);
        assertTrue(isPrime(last));
    }
    
    //e: the output visibly differs from expected
    //compare against the full correct sequence, showing the missing 19
     @Test
    public void testRevealsTheFault() {
    PrimeNumbers p = new PrimeNumbers();
        p.computePrimes(8);
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        assertEquals(expected, toList(p));
        
    }
    
    
    
}
