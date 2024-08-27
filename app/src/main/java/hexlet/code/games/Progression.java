package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static int[] progressionRandom(int length, int start, int step) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    public static void progression() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.gameEngine();

        System.out.println("What number is missing in the progression?");
        int length = 10;
        int step = 3;
        int start = random.nextInt(0, 20);

        int correctAnswers = 0;

        for (int j = 0; j < 3; j++) {
            int[] progression = progressionRandom(length, start, step);
            int hiddenIndex = random.nextInt(length);
            int hiddenValue = progression[hiddenIndex];

            System.out.println("Question: ");
            for (int i = 0; i < length; i++) {
                if (i == hiddenIndex) {
                    System.out.println(".. ");
                } else {
                    System.out.println(progression[i] + " ");
                }
            }
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == hiddenValue) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was" + "'" + hiddenValue + "'");
                System.out.println("Let's try again!");
                return;
            }
            if (correctAnswers == 3) {
                System.out.println("Congratulations " + userName + "!");
                return;
            }
        }
    }
}
