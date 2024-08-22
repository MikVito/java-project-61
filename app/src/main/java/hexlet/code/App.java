package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.ParityCheck;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n");

        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");

        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case 1:
                Cli cli = new Cli();
                cli.cli();
                break;

            case 2:
                ParityCheck.parityCheck();
                break;

            case 3:
                Calculator.calc();
                break;

            case 0:
                System.out.println("See you soon");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid insert, please select game number 0, 1, 2, or 3");
                break;
        }
    }
}


