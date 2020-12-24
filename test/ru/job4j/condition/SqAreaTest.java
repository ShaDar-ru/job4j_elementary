package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {
    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        double p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K1Then075() {
        double p = 4;
        int k = 3;
        double expected = 0.75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K2Then087() {
        double p = 4;
        int k = 2;
        double expected = 0.88;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}