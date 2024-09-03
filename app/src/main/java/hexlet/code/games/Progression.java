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

    public static void progression() {
        String[][] round = new String[COUNTS_OF_ROUND][2];
        Random random = new Random();
        for (int i = 0; i < round.length; i++) {
            int start = random.nextInt(1, 20) + 1;

            int[] progression = progressionRandom(ARRAY_LENGTH, start, ARRAY_STEP);
            String[] progressionToString = new String[]{Integer.toString(progression[i])};
            var missedNum = random.nextInt(1, progressionToString.length);
            round[i][QUESTION] = progressionToString[missedNum];
            progressionToString[missedNum] = "..";
            round[i][CORRECT_ANSWERS] = String.join(" ", progressionToString);
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
