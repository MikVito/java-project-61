package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void calc() {
        String userName = Engine.gameEngine();
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;

        Random randomNum = new Random();
        int randomV1 = randomNum.nextInt(1, 15) + 1;
        int randomV2 = randomNum.nextInt(1, 10) + 2;

        int mult = randomV2 * randomV1;
        int sum = randomV1 + randomV2;
        int diff = randomV1 - randomV2;

        int[] result = {mult, sum, diff};
        String[] operator = {"*", "+", "-"};

        for (int i = 0; i < 3; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + randomV1 + " " + operator[i] + " " + randomV2);
            int gameAnswer = scanner.nextInt();
            System.out.println("Your answer: " + gameAnswer);

            if (gameAnswer == result[i]) {
                System.out.println("Correct!");
                correctAnswers++;

            } else {
                System.out.println(gameAnswer + " is wrong answer ;(\nCorrect answer was " + result[i]);
                System.out.println("Let's try again!");
                return;
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations. " + userName + "!");
        }
    }
}
