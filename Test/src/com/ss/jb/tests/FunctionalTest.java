package com.ss.jb.tests;

import com.ss.jb.weekone.Functional;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FunctionalTest {
    Functional func = new Functional();

    @Test
    public void rightTest(){
        assertEquals(Arrays.asList(6,8,6,8,1), func.right(Arrays.asList(16,8,886,8,1)));
        assertEquals(Arrays.asList(1,2,3), func.right(Arrays.asList(1,22,93)));
        assertEquals(Arrays.asList(0,0), func.right(Arrays.asList(10,0)));
        assertNotEquals(Arrays.asList(1,3), func.right(Arrays.asList(25,42)));
    }

    @Test
    public void dubTest (){
        assertEquals(Arrays.asList(2,4,6), func.dob(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(12,16,12,16,-2), func.dob(Arrays.asList(6,8,6,8,-1)));
        assertEquals(Arrays.asList(), func.dob(Arrays.asList()));


    }

    @Test
    public void remTest(){
        assertEquals(Arrays.asList("a","bb","c"), func.remove(Arrays.asList("ax","bb","cx")));
        assertEquals(Arrays.asList("a","bb","c"), func.remove(Arrays.asList("xxax","xbxbx","xxcx")));
        assertEquals(Arrays.asList(""), func.remove(Arrays.asList("x")));


    }
}
