package hexlet.code;

import java.util.Random;

public class Generator {
    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }
}
