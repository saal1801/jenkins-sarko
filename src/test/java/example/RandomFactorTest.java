package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomFactorTest {

    RandomFactor randomFactor = new RandomFactor();

    @Test
    void randomBetween1And10() {
        int num = randomFactor.randomBetween1And10();
        assertTrue(num >= 1 && num <= 10, "Number between 1 and 10 failed");
    }
}