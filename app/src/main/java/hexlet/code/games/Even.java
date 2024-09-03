package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final String STRING = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 1;
    public static final int BOUND_OF_RANDOM_V_2 = 100;

    public static void parityCheck() {
        String[][] round = new String[COUNT_OF_ROUNDS][2];
        for (int i = 0; i < round.length; i++) {
            Random random = new Random();
            var randomNum = random.nextInt(BOUND_OF_RANDOM_V_1, BOUND_OF_RANDOM_V_2) + 1;
            round[i][QUESTION] = Integer.toString(randomNum);
            round[i][CORRECT_ANSWER] = logicOfEven(randomNum) ? "yes" : "no";
        }
        Engine.gameEngine(STRING, round);
    }
    public static boolean logicOfEven(int evenNum) {
        return evenNum % 2 == 0;
    }
}
