package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;

    public static void gameEngine(String string, String[][] round) {
        var userName = Cli.greetings();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println(string);

        while (count < COUNT_OF_ROUNDS) {
            System.out.println("Question: " + round[count][QUESTION]);
            System.out.println("Your answer is: ");
            var userAnswer = scanner.nextLine();
            if (userAnswer.equals(round[count][CORRECT_ANSWER])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was" + "'" + round[count][CORRECT_ANSWER] + "'");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        if (count == COUNT_OF_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!\nYou are Winner!!!");
        }
    }
}

