package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Progression {
    public static final String STRING = "What number is missing in the progression?";
    public static final int COUNTS_OF_ROUND = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWERS = 1;
    public static final int ARRAY_LENGTH = 10;
    public static final int ARRAY_STEP = 3;
    public static int BOUND_OF_RANDOM = 10;

    public static void progression() {
        String[][] round = new String[COUNTS_OF_ROUND][2];

        for (int i = 0; i < round.length; i++) {
            Random random = new Random();
            int start = random.nextInt(BOUND_OF_RANDOM) + 1;

            int[] progression = progressionRandom(ARRAY_LENGTH, start, ARRAY_STEP);
            String[] progressionToString = new String[progression.length];
            for (int j = 0; j < progression.length; j++) {
                progressionToString[j] = Integer.toString(progression[j]);
            }
            int missedNum = random.nextInt(1, progressionToString.length);
            String correctAnswer = progressionToString[missedNum];
            progressionToString[missedNum] = "..";
            round[i][QUESTION] = String.join(" ", progressionToString);
            round[i][CORRECT_ANSWERS] = correctAnswer;
        }
        Engine.gameEngine(STRING, round);
    }

    public static int[] progressionRandom(int length, int start, int step) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
