package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtServiceTest {
    @Test
    public void shouldSqrtService() {
        SqrtService service = new SqrtService();
        int lowerLimit = 10;
        int upperLimit = 99;

        int expected = 6;

        long actual = service.rangeOfNumbers(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

}