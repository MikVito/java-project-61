package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static final String STRING = "Find the greatest common divisor of given numbers.";
    public static final int countOfRounds = 3;
    public static final int question = 0;
    public static final int correctAnswers = 1;
    public static final int boundOfRandomV1 = 100;
    public static final int boundOfRandomV2 = 55;

    public static void divisor() {
        Random random = new Random();
        String[][] round = new String[countOfRounds][2];
        for (int i = 0; i < round.length; i++) {
            int randomNumV1 = random.nextInt(boundOfRandomV1) + 1;
            int randomNumV2 = random.nextInt(boundOfRandomV2) + 1;
            round[i][question] = randomNumV1 + " " + randomNumV2;
            round[i][correctAnswers] = Integer.toString(dsg(randomNumV1, randomNumV2));
        }
        Engine.gameEngine(STRING, round);
    }
    public static int dsg(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

