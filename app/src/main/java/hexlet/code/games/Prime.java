package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;


public class Prime {
    public static final String TEXT = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int BOUND_OF_RANDOM_V_1 = 2;
    public static final int BOUND_OF_RANDOM_V_2 = 101;

    public static void generatePrimeNum() {
        int roundCount = Engine.COUNT_OF_ROUNDS;
        String[][] round = new String[roundCount][2];
        for (int i = 0; i < round.length; i++) {
            int randomNum = Generator.getRandomInt(BOUND_OF_RANDOM_V_1, BOUND_OF_RANDOM_V_2);
            round[i][Engine.QUESTION] = Integer.toString(randomNum);
            round[i][Engine.CORRECT_ANSWER] = isPrime(randomNum) ? "yes" : "no";
        }
        Engine.gameEngine(TEXT, round);
    }

    public static boolean isPrime(int prime) {
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
