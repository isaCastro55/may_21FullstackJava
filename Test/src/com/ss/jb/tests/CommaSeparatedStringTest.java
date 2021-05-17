package com.ss.jb.tests;

import com.ss.jb.five.CommaSeparatedString;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CommaSeparatedStringTest {
    CommaSeparatedString c = new CommaSeparatedString();

    @Test
    public void cSSTest(){
        assertEquals("o3,e44", c.cSS(Arrays.asList(3,44)));
        assertEquals("o5,e6,o7,e8,o111,e112", c.cSS(Arrays.asList(5,6,7,8,111,112)));
        assertNotEquals("e9,o60", c.cSS(Arrays.asList(9,60)));


    }
}
