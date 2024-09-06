package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;


public class Calculator {
    public static final String TEXT = "What is the result of the expression?";
    public static final int START = 1;
    public static final int BOUND_OF_RANDOM_V_1 = 100;
    public static final int BOUND_OF_RANDOM_V_2 = 50;

    public static void generateCalculation() {
        int roundCount = Engine.COUNT_OF_ROUNDS;
        String[][] round = new String[roundCount][2];
        for (int i = 0; i < round.length; i++) {
            int randomNum1 = Generator.getRandomInt(START, BOUND_OF_RANDOM_V_1) + 1;
            int randomNum2 = Generator.getRandomInt(START, BOUND_OF_RANDOM_V_2) + 1;

            String[] stringOperator = {"*", "+", "-"};
            String operator = stringOperator[i % stringOperator.length];

            round[i][Engine.QUESTION] = randomNum1 + " " + stringOperator[i] + " " + randomNum2;
            round[i][Engine.CORRECT_ANSWER] = String.valueOf(performCalculator(randomNum1, randomNum2, operator));
        }
        Engine.gameEngine(TEXT, round);
    }

    public static int performCalculator(int num1, int num2, String operator) {
        switch (operator) {
            case "*":
                return num1 * num2;
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}



