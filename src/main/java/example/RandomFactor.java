package example;

import java.util.Random;

public class RandomFactor {

    public int randomBetween1And10() {
        Random rand = new Random();
        int max = 10;
        int min = 1;
        return rand.nextInt((max - min) + 1) + min;
    }

}
