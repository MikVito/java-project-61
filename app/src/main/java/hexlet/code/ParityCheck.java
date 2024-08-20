package hexlet.code;

import java.util.Scanner;

public class ParityCheck {
    public static void parityCheck() {
        int randomNum = (int) (Math.random() * 100) + 1;
        String parity = randomNum % 2 == 0 ? "yes" : "no";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + randomNum);
        String gameAnswer = scanner.nextLine();
        System.out.println("Your answer: " + gameAnswer);

        if (gameAnswer.equals(parity)) {
            System.out.println("Correct!");
        } else {
            System.out.println(gameAnswer + " is wrong answer ;(\nCorrect answer was " + parity);
            System.out.println("Let's try again!");
            return;
        }
        scanner.close();
    }
}
