package com.sweater.sweater;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author @bkalika
 * Created on 06.08.2022 7:20 AM
 */
public class SimpleTest {

    @Test
    public void test() {
        int x = 2;
        int y = 23;
        Assert.assertEquals(25, x + y);
    }
}
