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
        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case 1:
                Cli.greetings();
                break;

            case 2:
                Even.parityCheck();
                break;

            case 3:
                Calculator.calc();
                break;

            case 4:
                GCD.divisor();
                break;

            case 5:
                Progression.progression();
                break;

            case 6:
                Prime.primeOf();
                break;

            case 0:
                System.out.println("See you soon");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid insert, please select game number from 0 to 6");
                break;
        }
    }
}


