package com.ss.jb.tests;

import com.ss.jb.five.BasicLambdas;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BasicLambdasTest {
    BasicLambdas bl = new BasicLambdas();

    @Test
    public void shortestToLongestTest(){
        assertEquals(new String[]{"g","bb","aa","ccc","dddd"}, bl.shortestToLongest(new String[]{"bb","ccc","dddd","g","aa"}));
        assertNotEquals(new String[]{"Good","bye","HelloWorld"}, bl.shortestToLongest(new String[]{"Good","bye","HelloWorld"}));
    }

    @Test
    public void LongestToShortestTest(){
        assertEquals(new String[]{"dddd","ccc","bb","aa","g"}, bl.longestToShortest(new String[]{"bb","ccc","dddd","g","aa"}));
        assertNotEquals(new String[]{"Good","bye","HelloWorld"}, bl.longestToShortest(new String[]{"Good","bye","HelloWorld"}));
    }
    @Test
    public void alphabeticalTest(){
        assertEquals(new String[]{"aa","bb","ccc","dddd","g"}, bl.alphabetical(new String[]{"bb","ccc","dddd","g","aa"}));
        assertNotEquals(new String[]{"Good","bye","HelloWorld"}, bl.alphabetical(new String[]{"Good","bye","HelloWorld"}));
    }
    @Test
    public void eFirstTest(){
        assertEquals(new String[]{"empty","hello","dddd","ccc","g"}, bl.eFirst(new String[]{"dddd","ccc","empty","g","hello"}));
        assertNotEquals(new String[]{"Good","bye","HelloWorld"}, bl.eFirst(new String[]{"Good","bye","HelloWorld"}));
    }
    @Test
    public void eFirstTwoTest(){
        assertEquals(new String[]{"empty","hello","dddd","ccc","g"}, bl.eFirstTwo(new String[]{"dddd","ccc","empty","g","hello"}));
        assertNotEquals(new String[]{"Good","bye","HelloWorld"}, bl.eFirstTwo(new String[]{"Good","bye","HelloWorld"}));
    }
}
