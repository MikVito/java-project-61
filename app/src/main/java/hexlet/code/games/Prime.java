package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static final String STRING = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static int countOfRounds = 3;
    public static int question = 0;
    public static int correctAnswers = 1;
    public static int BOUND_OF_RANDOM_V1 = 1;
    public static int BOUND_OF_RANDOM_V2 = 100;

    public static void primeOf() {
        Random random = new Random();
        String[][] round = new String[countOfRounds][2];
        for (int i = 0; i < round.length; i++) {
            int randomNum = random.nextInt(BOUND_OF_RANDOM_V1, BOUND_OF_RANDOM_V2) + 1;
            round[i][question] = Integer.toString(randomNum);
            round[i][correctAnswers] = primeNum(randomNum) ? "yes" : "no";
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
