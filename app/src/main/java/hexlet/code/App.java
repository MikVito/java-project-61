package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n");

        System.out.println("0 - Exit\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime");
        String gameNumber = scanner.nextLine();
        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case "1" -> Cli.greetings();
            case "2" -> Even.parityCheck();
            case "3" -> Calculator.calc();
            case "4" -> GCD.calculateDivisor();
            case "5" -> Progression.generateProgressionRound();
            case "6" -> Prime.numPrime();
            case "0" -> System.out.println("See you soon");
            default -> System.out.println("Invalid insert, please select game number from 0 to 6");
        }
    }
}


