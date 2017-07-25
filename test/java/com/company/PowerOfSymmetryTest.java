package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 25.07.2017
 */
public class PowerOfSymmetryTest {
    @Test
    public void getPowerOfNumber() throws Exception {
        Assert.assertEquals(2, PowerOfSymmetry.getPowerOfSymmetry(123322));
        Assert.assertEquals(4, PowerOfSymmetry.getPowerOfSymmetry(2234322));

    }

}