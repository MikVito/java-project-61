package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GCD {
    public static final String TEXT = "Find the greatest common divisor of given numbers.";
    public static final int RANDOM_START = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 2;
    public static final int BOUND_OF_RANDOM_V_2 = 100;

    public static void calculateDivisor() {
        int roundCount = Engine.COUNT_OF_ROUNDS;
        String[][] round = new String[roundCount][2];
        for (int i = 0; i < round.length; i++) {
            int randomNumV1 = Generator.getRandomInt(RANDOM_START, BOUND_OF_RANDOM_V_1) + 1;
            int randomNumV2 = Generator.getRandomInt(RANDOM_START, BOUND_OF_RANDOM_V_2) + 1;
            round[i][Engine.QUESTION] = randomNumV1 + " " + randomNumV2;
            round[i][Engine.CORRECT_ANSWER] = Integer.toString(findGreatestGSD(randomNumV1, randomNumV2));
        }
        Engine.gameEngine(TEXT, round);
    }

    public static int findGreatestGSD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

