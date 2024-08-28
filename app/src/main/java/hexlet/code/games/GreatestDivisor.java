package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GreatestDivisor {

    public static int dsg(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void divisor() {
        String userName = Engine.gameEngine();
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswers = 0;

        for (int i = 0; i < 3; i++) {

            Random random = new Random();
            int randomV1 = random.nextInt(100);
            int randomV2 = random.nextInt(55);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Question: " + randomV1 + " " + randomV2);
            int isAnswer = dsg(randomV1, randomV2);
            int userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer == isAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(\nCorrect answer was " + dsg(randomV1, randomV2));
                System.out.println("Let's try again!");
                return;
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations " + userName + "!");
        }
    }
}

