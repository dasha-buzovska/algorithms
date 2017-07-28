package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28.07.2017
 */
public class SpiderNFlyTest {
    @Test
    public void findRoute() throws Exception {
        double[] size = new double[]{1, 1, 1};
        double[] size2 = new double[]{3, 3, 3};
        assertEquals(0, SpiderNFly.findRoute(size,1, 1, 1, 1, 0), 0.0005);
        assertEquals(4.123, SpiderNFly.findRoute(size2,1, 1, 3, 2, 2), 0.0005);
        assertEquals(6.082762, SpiderNFly.findRoute(size2,1, 1, 2, 2, 3), 0.0005);
    }

}