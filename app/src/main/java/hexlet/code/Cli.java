package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String userName;

    public void cli() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name?\n");
        userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }

    public String getUserName() {
        return userName;
    }
}
