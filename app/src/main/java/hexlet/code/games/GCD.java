package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GCD {
    public static final String STRING = "Find the greatest common divisor of given numbers.";
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWERS = 1;
    public static final int RANDOM_START = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 2;
    public static final int BOUND_OF_RANDOM_V_2 = 100;

    public static void divisor() {
        String[][] round = new String[COUNT_OF_ROUNDS][2];
        for (int i = 0; i < round.length; i++) {
            int randomNumV1 = Generator.getRandomInt(RANDOM_START, BOUND_OF_RANDOM_V_1) + 1;
            int randomNumV2 = Generator.getRandomInt(RANDOM_START, BOUND_OF_RANDOM_V_2) + 1;
            round[i][QUESTION] = randomNumV1 + " " + randomNumV2;
            round[i][CORRECT_ANSWERS] = Integer.toString(dsg(randomNumV1, randomNumV2));
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

