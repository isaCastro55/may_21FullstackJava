package com.ss.jb.tests;
import org.testng.annotations.Test;
import com.ss.jb.four.Line;


import static org.junit.Assert.*;


public class LineTest {

    private Line lin = new Line(4,6,10,30);

    @Test
    public void slopeTest(){

        assertEquals(new Double (4.0),lin.getSlope(), .0001);
        assertNotEquals(new Double(6.0), lin.getSlope(), .0001);
    }

    @Test
    public void distanceTest(){

        assertEquals(new Double (24.73863),lin.getDistance(), .0001);
        assertNotEquals(new Double(3.5), lin.getDistance(), .0001);
    }

    @Test
    public void parallelTest(){
        Line test = new Line(1, 9, 2, 13);
        Line fail = new Line(7,30,10,20);
        assertTrue(lin.parallelTo(test));
        assertFalse(lin.parallelTo(fail));
        assertNotEquals(true, lin.parallelTo(fail));
    }


}
