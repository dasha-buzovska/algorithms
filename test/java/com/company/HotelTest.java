package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 21.07.2017.
 */
public class HotelTest {
    @Test
    public void createTable() throws Exception {
        Assert.assertArrayEquals(new int[][]{{4, 2, 1}, {7, 5, 3}, {9, 8, 6}}, Hotel.createTable(3));
    }
}