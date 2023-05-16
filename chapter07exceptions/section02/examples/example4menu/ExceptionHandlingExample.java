package chapter07exceptions.section02.examples.example4menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int option = 0;

        while (!validInput) {
            try {
                displayMenu();
                System.out.print("Enter your option: ");
                option = scanner.nextInt();

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
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
    }

    public static void processOption(int option) throws InvalidOptionException {
        switch (option) {
            case 1:
                System.out.println("You chose Option 1");
                // Perform actions for Option 1
                break;
            case 2:
                System.out.println("You chose Option 2");
                // Perform actions for Option 2
                break;
            case 3:
                System.out.println("You chose Option 3");
                // Perform actions for Option 3
                break;
            default:
                throw new InvalidOptionException();
        }
    }


}

