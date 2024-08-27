package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static boolean primeNum(int prime) {
        if (prime <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeOf() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userName = Engine.gameEngine();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswers = 0;

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(0, 10);
            boolean isPrime = Prime.primeNum(number);
            String correctAnswer = isPrime ? "yes" : "no";

            System.out.println("Question: " + number);
            String userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);

            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(");
            }
            if (correctAnswers == 3) {
                System.out.println("Congratulations " + userName + "!");
            }
        }
    }
}
