package hexlet.code.games;

import java.util.Scanner;

public class ParityCheck {
    public static void parityCheck() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?\n");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;

        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 100) + 1;
            String parity = randomNum % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomNum);
            String gameAnswer = scanner.nextLine();
            System.out.println("Your answer: " + gameAnswer);

            if (gameAnswer.equals(parity)) {
                System.out.println("Correct!");
                correctAnswers++;

            } else {
                System.out.println(gameAnswer + " is wrong answer ;(\nCorrect answer was " + parity);
                System.out.println("Let's try again!");
                return;
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations. " + userName + "!");
        }
    }
}
