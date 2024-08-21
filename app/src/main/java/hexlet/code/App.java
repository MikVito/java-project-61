package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
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

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid insert, please select 0, 1 or 2");
                break;
        }
    }
}


