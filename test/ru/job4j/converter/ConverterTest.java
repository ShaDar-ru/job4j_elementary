package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0EuroThen0Rbl() {
        int in = 0;
        int expected = 0;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140RblThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert12DollarThen720Ruble() {
        int in = 12;
        int expected = 720;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}