package com.bae.calc;

import org.junit.Assert;
import org.junit.Test;

class ExponentialTest {
    @Test
    public void testExponential() throws Exception {
        Exponential exponential = new Exponential();

        Exponential.exponential("X to the A");
        String answer = Exponential.exponential(2,2);

        Assert.assertEquals(answer,4);

    }
}