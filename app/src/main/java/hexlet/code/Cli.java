package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void cli() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name?\n");
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
