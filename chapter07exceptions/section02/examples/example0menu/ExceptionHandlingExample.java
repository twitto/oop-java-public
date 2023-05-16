package chapter07exceptions.section02.examples.example0menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false; // user input
        int option = 0; // option from a menu

        while (!validInput)
        {
            try {
                displayMenu();
                System.out.print("Enter your option: ");
                option = scanner.nextInt();
                // 1, 2, 3 regular flow
                // 5, "a", "abc" irregular/exceptional flow

                processOption(option);

                validInput = true; // If no exception occurs, input is considered valid

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.\n");
                scanner.nextLine(); // Clear the input buffer
            } catch (InvalidOptionException e) {
                System.out.println("Invalid option selected. Please choose a valid option.\n");
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. new game");
        System.out.println("2. resume");
        System.out.println("3. leaderboard");
    }

    public static void processOption(int option) throws InvalidOptionException {
        switch (option) {
            case 1:
                System.out.println("game is starting...");
                // Perform actions for Option 1
                break;
            case 2:
                System.out.println("resuming last game...");
                // Perform actions for Option 2
                break;
            case 3:
                System.out.println("Showing leaderboard");
                // Perform actions for Option 3
                break;
            default:
                throw new InvalidOptionException("menu has only option 1, 2, and 3."); //"menu has only option 1, 2, and 3."
        }
        //
        //
        //
        //
    }


}

