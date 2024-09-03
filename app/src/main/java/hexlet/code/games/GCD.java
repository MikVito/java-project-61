package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static final String STRING = "Find the greatest common divisor of given numbers.";
    public static int countOfRounds = 3;
    public static int question = 0;
    public static int correctAnswers = 1;

    public static void divisor() {
        Random random = new Random();
        String[][] round = new String[countOfRounds][2];
        for (int i = 0; i < round.length; i++) {
            int randomNumV1 = random.nextInt(100) + 1;
            int randomNumV2 = random.nextInt(55) + 1;
            round[i][question] = randomNumV1 + " " + randomNumV2;
            round[i][correctAnswers] = Integer.toString(dsg(randomNumV1, randomNumV2));
        }
        Engine.gameEngine(STRING, round);
    }

    public static int dsg(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//String userName = Engine.gameEngine();
//        System.out.println("Find the greatest common divisor of given numbers.");
//
//        int correctAnswers = 0;
//
//        for (int i = 0; i < 3; i++) {
//
//            Random random = new Random();
//            int randomV1 = random.nextInt(100);
//            int randomV2 = random.nextInt(55);
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Question: " + randomV1 + " " + randomV2);
//            int isAnswer = dsg(randomV1, randomV2);
//            int userAnswer = scanner.nextInt();
//            System.out.println("Your answer: " + userAnswer);
//
//            if (userAnswer == isAnswer) {
//                System.out.println("Correct!");
//                correctAnswers++;
//            } else {
//                System.out.println(userAnswer + " is wrong answer ;(\nCorrect answer was " + dsg(randomV1, randomV2));
//                System.out.println("Let's try again!");
//                return;
//            }
//        }
//        if (correctAnswers == 3) {
//            System.out.println("Congratulations " + userName + "!");
//        }
