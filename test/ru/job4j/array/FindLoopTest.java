package ru.job4j.array;

import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas1Then4() {
        int[] input = {11, 21, 43, 7, 1, 79, 88};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expected = 4;
        assertThat(result, is(expected));

    }

    @Test
    public void whenArrayHas2ThenNeg1() {
        int[] input = {11, 21, 43, 7, 1, 79, 88};
        int value = 77;
        int result = FindLoop.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}