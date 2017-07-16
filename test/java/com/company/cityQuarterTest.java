package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14.07.2017.
 */
public class cityQuarterTest {
    @Test
    public void calculateQuarters() throws Exception {
        assertEquals(8, cityQuarter.calculateQuarters(9, 5));
        assertEquals(16, cityQuarter.calculateQuarters(11, 9));
        assertEquals(2, cityQuarter.calculateQuarters(3, 3));
        assertEquals(4, cityQuarter.calculateQuarters(4, 3));
        assertEquals(10, cityQuarter.calculateQuarters(7, 6));
        assertEquals(10, cityQuarter.calculateQuarters(11, 3));
    }

}