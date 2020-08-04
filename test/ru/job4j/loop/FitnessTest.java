package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik1Month() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanGreatNik2Month() {
        int month = Fitness.calc(25, 50);
        assertThat(month, is(2));
    }

    @Test
    public void whenIvanGreatNik3Month() {
        int month = Fitness.calc(20, 60);
        assertThat(month, is(3));
    }

    @Test
    public void whenIvanGreatNikMonth() {
        int month = Fitness.calc(90, 90);
        assertThat(month, is(1));
    }
}
