package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Calculator {
    public static final String STRING = "What is the result of the expression?";
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;
    public static final int START = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 100;
    public static final int BOUND_OF_RANDOM_V_2 = 50;


    public static void calc() {
        Random random = new Random();
        String[][] round = new String[COUNT_OF_ROUNDS][2];
        for (int i = 0; i < round.length; i++) {
            int randomNum1 = random.nextInt(START, BOUND_OF_RANDOM_V_1) + 1;
            int randomNum2 = random.nextInt(START, BOUND_OF_RANDOM_V_2) + 1;

            int mult = randomNum1 * randomNum2;
            int sum = randomNum1 + randomNum2;
            int diff = randomNum1 - randomNum2;
            int[] operator = {mult, sum, diff};

            String mult2 = "*";
            String sum2 = "+";
            String diff2 = "-";
            String[] stringOperator = {mult2, sum2, diff2};

            round[i][QUESTION] = randomNum1 + " " + stringOperator[i] + " " + randomNum2;
            round[i][CORRECT_ANSWER] = String.valueOf(operator[i]);
        }
        Engine.gameEngine(STRING, round);
    }
}

