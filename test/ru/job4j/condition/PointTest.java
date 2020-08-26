package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;



public class PointTest {

    @Test
    public void whenXTwo() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out,0.1);
    }

    @Test
    public void whenX3D() {
        Point a = new Point(0, 0,0);
        Point b = new Point(0, 2,2);
        double expected = 2.8284271247461903;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out,0.1);
    }
}