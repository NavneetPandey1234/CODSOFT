import java.util.Random;
import java.util.Scanner;

public class Number_guess_game {

    public static void main(String[] args) {
        gameMenu();
    }

    public static void gameMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Game Menu:");
            System.out.println("1. .....Start Game.....");
            System.out.println("2. .....Exit.....");
            System.out.print("Enter your choice (1, 2): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    startGame();
                    break;
                case 2:
                    System.out.println("Exiting game. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void startGame() {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        final int maxAttempts = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 10 tries to guess the number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                return;
            }
        }

        System.out
                .println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess + ".");
    }
}
