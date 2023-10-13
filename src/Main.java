import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        while (true) {
            System.out.println("Press Enter to roll the dice...");
            scanner.nextLine();

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You crapped out! You lose!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You rolled a natural! You win!");
            } else {
                System.out.println("The point is now " + crapsRoll);
                System.out.println("Roll again to make the point or roll a 7 to lose.");
                boolean continueRolling = true;

                while (continueRolling) {
                    System.out.println("Press Enter to roll the dice...");
                    scanner.nextLine();

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int newRoll = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + newRoll);

                    if (newRoll == crapsRoll) {
                        System.out.println("You made the point! You win!");
                        continueRolling = false;
                    } else if (newRoll == 7) {
                        System.out.println("You rolled a 7. You lose!");
                        continueRolling = false;
                    }
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
