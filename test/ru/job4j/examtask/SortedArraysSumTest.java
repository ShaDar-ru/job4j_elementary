package ru.job4j.examtask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortedArraysSumTest {

    @Test
    public void whenArrAMoreArrBThen() {
        int[] arrA = new int[]{3, 12, 24, 27};
        int[] arrB = new int[]{2, 11, 23};
        int[] expected = new int[]{2, 3, 11, 12, 23, 24, 27};
        int[] res = SortedArraysSum.arraysSum(arrA, arrB);
        assertThat(res, is(expected));
    }

    @Test
    public void whenArrBMoreArrAThen() {
        int[] arrA = new int[]{2, 11, 23};
        int[] arrB = new int[]{3, 12, 24, 27};
        int[] expected = new int[]{2, 3, 11, 12, 23, 24, 27};
        int[] res = SortedArraysSum.arraysSum(arrA, arrB);
        assertThat(res, is(expected));
    }

    @Test
    public void whenNumArrBMoreArrAThen() {
        int[] arrA = new int[]{1, 2, 3};
        int[] arrB = new int[]{4, 5, 6};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        int[] res = SortedArraysSum.arraysSum(arrA, arrB);
        assertThat(res, is(expected));
    }

    @Test
    public void whenNumArrAEqlArrBThen() {
        int[] arrA = new int[]{1, 2, 3};
        int[] arrB = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 1, 2, 2, 3, 3};
        int[] res = SortedArraysSum.arraysSum(arrA, arrB);
        assertThat(res, is(expected));
    }

    @Test
    public void whenOneArrEmptyThen() {
        int[] arrA = new int[]{};
        int[] arrB = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 3};
        int[] res = SortedArraysSum.arraysSum(arrA, arrB);
        assertThat(res, is(expected));
    }
}