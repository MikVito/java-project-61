package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;


public class Progression {
    public static final String TEXT = "What number is missing in the progression?";
    public static final int ARRAY_LENGTH = 10;
    public static final int ARRAY_STEP = 3;
    public static final int BOUND_OF_RANDOM_MIN = 1;
    public static final int BOUND_OF_RANDOM_MAX = 10;

    public static void generateProgressionRound() {
        int roundCount = Engine.COUNT_OF_ROUNDS;
        String[][] round = new String[roundCount][2];

        for (int i = 0; i < round.length; i++) {
            int start = Generator.getRandomInt(BOUND_OF_RANDOM_MIN, BOUND_OF_RANDOM_MAX) + 1;

            int[] progression = progressionRandom(ARRAY_LENGTH, start, ARRAY_STEP);
            String[] progressionToString = new String[progression.length];
            for (int j = 0; j < progression.length; j++) {
                progressionToString[j] = Integer.toString(progression[j]);
            }
            int missedNum = Generator.getRandomInt(BOUND_OF_RANDOM_MIN, progressionToString.length);
            String correctAnswer = progressionToString[missedNum];
            progressionToString[missedNum] = "..";
            round[i][Engine.QUESTION] = String.join(" ", progressionToString);
            round[i][Engine.CORRECT_ANSWER] = correctAnswer;
        }
        Engine.gameEngine(TEXT, round);
    }

    public static int[] progressionRandom(int length, int start, int step) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
