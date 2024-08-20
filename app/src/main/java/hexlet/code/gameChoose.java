package hexlet.code;

import java.util.Scanner;

public class gameChoose {
    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n");
        System.out.println("1 - Greet\n 0 - Exit");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
             Cli.cli();
        }
    }
}
