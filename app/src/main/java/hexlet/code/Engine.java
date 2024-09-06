package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;
    public static final int START = 1;

    public static void gameEngine(String string, String[][] round) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?\n");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(string);

        for (String[] roundOf : round) {
            System.out.println("Question: " + roundOf[QUESTION]);
            System.out.println("Your answer is: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(roundOf[CORRECT_ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was" + "'" + roundOf[CORRECT_ANSWER] + "'");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName + "!\nYou are Winner!!!");
    }
}

