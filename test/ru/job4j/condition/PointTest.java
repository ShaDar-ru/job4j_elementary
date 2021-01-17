package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then141() {
        float expected = 1.41f;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus11to22then424() {
        float expected = 4.24f;
        int x1 = -1;
        int y1 = -1;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then707() {
        float expected = 7.07f;
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2PointsIn2D() {
        float exp = 4.24f;
        Point a = new Point(-1, -1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when2PointsIn2D2() {
        float exp = 2f;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when2PointsIn3D() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        float exp = 1.73f;
        Assert.assertEquals(exp, out, 0.01);
    }
}