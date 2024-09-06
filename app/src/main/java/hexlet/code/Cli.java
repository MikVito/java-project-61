package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?\n");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
