package hexlet.code;

import java.util.Scanner;

public class GameChoose {
    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
            Cli.cli();
        } else if (gameNumber == 2) {
            ParityCheck.parityCheck();
        }
        if (gameNumber == 0) {
            System.exit(0);
        }
    }
}
