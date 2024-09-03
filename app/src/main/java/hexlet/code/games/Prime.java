package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static final String STRING = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWERS = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 1;
    public static final int BOUND_OF_RANDOM_V_2 = 100;

    public static void primeOf() {
        Random random = new Random();
        String[][] round = new String[COUNT_OF_ROUNDS][2];
        for (int i = 0; i < round.length; i++) {
            int randomNum = random.nextInt(BOUND_OF_RANDOM_V_1, BOUND_OF_RANDOM_V_2) + 1;
            round[i][QUESTION] = Integer.toString(randomNum);
            round[i][CORRECT_ANSWERS] = primeNum(randomNum) ? "yes" : "no";
        }
        Engine.gameEngine(STRING, round);
    }
    public static boolean primeNum(int prime) {
        for (int i = 2; i < Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
