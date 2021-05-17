package com.ss.jb.tests;
import com.ss.jb.weekone.LambdaImplementation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LambdaTest {
    private LambdaImplementation l = new LambdaImplementation();

//    @Test
//    public void oddTest(){
//        Odd x= l.getIsOd();
//        assertEquals("ODD",x.isOdd(5));
//        assertEquals("EVEN", x.isOdd(6));
//
//    }
//
//    @Test
//    public void primeTest(){
//        Prime x = l.getIsP();
//        assertEquals("PRIME", x.isPrime(499));
//        assertEquals("COMPOSITE", x.isPrime(100));
//    }
//
//
//    @Test
//
//    public void palTes(){
//        Palindrome x= l.getIsPal();
//        assertEquals("PALINDROME", x.isPalindrome(495594));
//        assertEquals("NOT PALINDROME", x.isPalindrome(12345));
//    }

    @Test
    public void checkTest(){
        assertEquals("EVEN\nPRIME\nPALINDROME\nODD\nCOMPOSITE",l.result("5\n" +
                "1 4\n" +
                "2 5\n" +
                "3 898\n" +
                "1 3\n" +
                "2 12").toString());
        assertEquals("PALINDROME\nPRIME\nEVEN\nNOT PALINDROME",l.result("4\n" +
                "3 454\n" +
                "2 499\n" +
                "1 898\n" +
                "3 7766").toString());
    }
}
