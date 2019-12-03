package com.bae.calc;

import com.sun.prism.impl.TextureResourcePool;
import org.junit.Assert;
import org.junit.Test;
import sun.plugin.viewer.IExplorerPluginObject;
import sun.plugin.viewer.context.IExplorerAppletContext;

import java.rmi.server.ExportException;

public class ExponentialTest {
    @Test
    public void testExponential() throws Exception {
        Exponential exponential = new Exponential();

        Exponential.exponential("X to the A");
        String answer = Exponential.exponential(2, 2);

        Assert.assertEquals(answer, "The answer is: 4.0");
    }

    @Test
    public void testExponent0() throws Exception {
        Exponential exponential = new Exponential();

        Exponential.exponential("X to the A");
        String answer = Exponential.exponential(2, 0);

        Assert.assertEquals("The answer is: 1.0",answer);
    }

    @Test
    public void test0ToThePowerOfX() throws Exception {
        Exponential exponential = new Exponential();

        Exponential.exponential("X to the A");
        String answer = Exponential.exponential(0,2);

        Assert.assertEquals("The answer is: 0.0", answer);
    }

    @Test
        public void test0ToThePowerOf0() throws ExportException {
            Exponential exponential = new Exponential();

            Exponential.exponential("X to the A");
            String answer = exponential.exponential(0,0);

            Assert.assertEquals("The answer is: 1.0",answer);
    }

    @Test
    public void test2ToTheMinus2() throws ExportException {
        Exponential exponential = new Exponential();

        Exponential.exponential("X to the A");
        String answer = exponential.exponential(2, -2);

        Assert.assertEquals("The answer is: 0.25",answer);
    }

    @Test
    public void test0ToTheMinus2() {{
        Exponential exponential = new Exponential();

        Exponential.exponential("X to the A");
        String answer = exponential.exponential(0, -2);

        Assert.assertEquals("The answer is: Infinity",answer);
    }
    }
}