package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 26.07.2017
 */
public class SquaresFromMatchesTest {
    @Test
    public void getNumberOfMatches() throws Exception {
        Assert.assertEquals(12, SquaresFromMatches.getNumberOfMatches(4));
        Assert.assertEquals(27, SquaresFromMatches.getNumberOfMatches(10));
        Assert.assertEquals(4, SquaresFromMatches.getNumberOfMatches(1));
    }

}