package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NextDateTest {

    @Test
    public void testNextDate_EndOfMonth() {
        assertArrayEquals(new int[]{1, 1, 2013}, NextDate.nextDate(31, 12, 2012));
    }

    @Test
    public void testNextDate_EndOfMonth_LeapYear() {
        assertArrayEquals(new int[]{29, 2, 2020}, NextDate.nextDate(28, 2, 2020));
    }

    @Test
    public void testNextDate_EndOfMonth_NotLeapYear() {
        assertArrayEquals(new int[]{1, 3, 2019}, NextDate.nextDate(28, 2, 2019));
    }

    @Test
    public void testNextDate_NotEndOfMonth() {
        assertArrayEquals(new int[]{2, 1, 2012}, NextDate.nextDate(1, 1, 2012));
    }

    @Test
    public void testNextDate_InvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> NextDate.nextDate(32, 1, 2012));
    }

    @Test
    public void testNextDate_InvalidMonth() {
        assertThrows(IllegalArgumentException.class, () -> NextDate.nextDate(1, 13, 2012));
    }

    @Test
    public void testNextDate_InvalidYear() {
        assertThrows(IllegalArgumentException.class, () -> NextDate.nextDate(1, 1, 1811));
    }
}

