package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax15to2Then15() {
        int result = Max.max(15, 2);
        assertThat(result, is(15));
    }

    @Test
    public void whenMax2to15Then15() {
        int result = Max.max(2, 15);
        assertThat(result, is(15));
    }

    @Test
    public void whenMax15to15Then15() {
        int result = Max.max(15, 15);
        assertThat(result, is(15));
    }
}