package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Even {
    public static final String TEXT = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 1;
    public static final int BOUND_OF_RANDOM_V_2 = 100;

    public static void parityCheck() {
        int roundCount = Engine.COUNT_OF_ROUNDS;
        String[][] round = new String[roundCount][2];
        for (int i = 0; i < round.length; i++) {
            var randomNum = Generator.getRandomInt(BOUND_OF_RANDOM_V_1, BOUND_OF_RANDOM_V_2) + 1;
            round[i][QUESTION] = Integer.toString(randomNum);
            round[i][CORRECT_ANSWER] = logicOfEven(randomNum) ? "yes" : "no";
        }
        Engine.gameEngine(TEXT, round);
    }
    public static boolean logicOfEven(int evenNum) {
        return evenNum % 2 == 0;
    }
}
