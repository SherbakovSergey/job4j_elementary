package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;



public class PointTest {

    @Test
    public void whenXTwo() {
        double expected = 2.0;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out,0.1);
    }
}