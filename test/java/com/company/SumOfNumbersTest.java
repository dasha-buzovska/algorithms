package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14.07.2017.
 */
public class SumOfNumbersTest {
    @Test
    public void findConjunctions() throws Exception {
        assertEquals("2 4", SumOfNumbers.findConjunctions(14));
    }

}