package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testSumEven() {
        int n = 10;
        int expectedSum = 30;

        int actualSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                actualSum += i;
            }
        }

        assertEquals(expectedSum, actualSum);
    }

    // You can add other test methods here to cover different functionalities of the code
}