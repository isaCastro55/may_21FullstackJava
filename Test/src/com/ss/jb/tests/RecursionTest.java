package com.ss.jb.tests;

import com.ss.jb.weekone.Recursion;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RecursionTest {
    Recursion rec= new Recursion();
    @Test
    public void recursionTest(){
        assertTrue(rec.groupSumClump(0, new Integer[]{2,4,8}, 10));
        assertTrue(rec.groupSumClump(0, new Integer[]{1, 2, 4, 8, 1},14));
        assertFalse(rec.groupSumClump(0,new Integer[]{2,4,4,8}, 14));
    }

}
