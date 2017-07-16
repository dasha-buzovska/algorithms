package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14.07.2017.
 */
public class SubwayTest {
    @Test
    public void calculateDistance() throws Exception {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{6,2});
        list.add(new int[]{2,9});
        list.add(new int[]{4,10});
        assertEquals(1482, Subway.calculateDistance(6,10,3, list));
    }

}