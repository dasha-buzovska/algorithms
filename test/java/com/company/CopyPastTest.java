package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14.07.2017.
 */
public class CopyPastTest {
    @Test
    public void calculateHours() throws Exception {
        assertEquals(3, CopyPast.calculateHours(5,6));
        assertEquals(4, CopyPast.calculateHours(8,3));
        assertEquals(5, CopyPast.calculateHours(13,4));
    }

}