package com.ss.jb.tests;

import com.ss.jb.five.LetterAThreeLetter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LetterAThreeLetterTest {
    LetterAThreeLetter l = new LetterAThreeLetter();

    @Test
    public void lATLTest(){
        assertEquals(Arrays.asList("ahe", "aey","aet"),l.lATL(Arrays.asList("whats","up","ahe","dog","aey","aet")));
        assertNotEquals(Arrays.asList("hi","I","like"),l.lATL(Arrays.asList("ayy","what","you","I","doing","like")));
    }
}
