import java.util.Scanner;
import java.util.Random;

public class JavaReviewExercises {

    public static void main(String[] args) {
        // Create a single Scanner and Random object
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Exercise 1: Check for Divisibility

        System.out.println("Exercise 1: Divisibility Check ");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // If the remainder is 0, the number divides evenly.
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(); // Print a newline for spacing

        // Exercise 2: Generate a Random Number in a Range

        System.out.println("Exercise 2: Random Number Generator ");
        System.out.print("Enter the minimum number for the range: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number for the range: ");
        int max = scanner.nextInt();

        // The formula for generating a random number within a range [min, max] is:
        // random.nextInt(max - min + 1) + min
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("The random number is: " + randomNumber);

        System.out.println(); // Print a newline for spacing

        // Exercise 3: Dice Roll Simulator

        System.out.println("Exercise 3: Dice Roll ");

        // Generate a random number between 1 and 6 for each die.
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;

        // Calculate the sum of the two dice.
        int sumOfDice = die1 + die2;

        System.out.println("You rolled a " + die1 + " and a " + die2 + ".");
        System.out.println("Their sum is: " + sumOfDice);

        // Close scanner
        scanner.close();
    }
}