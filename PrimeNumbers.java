/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author unik
 */
public class PrimeNumbers implements Iterable <Integer> {

    private List <Integer> primes = new ArrayList<Integer> ();
public void computePrimes (int n ){
    int count = 1;
    int number = 2;
    boolean isPrime;
    
    while (count <= n){
        isPrime = true;
        for (int divisor=2; divisor <= number/2; divisor++){
        if (number % divisor == 0){
            isPrime = false;
            break;
        }
            
         }
        if(isPrime && (number %10 !=9) ){ // this condition excludes all primes ending with digit 9. 
        primes.add(number);
        count++;
    }
        number++;
    }
}

@Override public Iterator <Integer> iterator(){
    return primes.iterator();
}
    @Override
    public String toString(){
    return primes.toString();
}   
}
