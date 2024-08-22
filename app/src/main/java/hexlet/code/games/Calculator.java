package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name?\n");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;

        Random randomNum = new Random();
        int randomV1 = randomNum.nextInt(20);
        int randomV2 = randomNum.nextInt(10);
        int randomV3 = randomNum.nextInt(15);

        int mult = randomV2 * randomV1;
        int sum = randomV1 + randomV3;
        int diff = randomV3 - randomV1;

        int[] result = {mult, sum, diff};
        String[] operator = {"*", "+", "-"};

        for (int i = 0; i < 3; i++) {

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
