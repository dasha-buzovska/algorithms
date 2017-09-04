package com.company;

import org.junit.Assert;

/**
 * Created by user on 04.09.2017
 */
public class SantasNumbersTest {
    @org.junit.Test
    public void findNumber() throws Exception {
        Assert.assertEquals(4, SantasNumbers.findNumber(9,23));
        Assert.assertEquals(3, SantasNumbers.findNumber(18,30));
        Assert.assertEquals(4, SantasNumbers.findNumber(18,31));
    }

}