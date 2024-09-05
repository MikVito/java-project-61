package hexlet.code;

import java.util.Random;

public class Generator {
    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        int randomGenerator = random.nextInt(min, max);
        return randomGenerator;
    }
}
