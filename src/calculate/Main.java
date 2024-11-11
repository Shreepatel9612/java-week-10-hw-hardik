package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        char continueCalculation = 'Y';

        while (continueCalculation == 'Y' || continueCalculation == 'y') {
            // Prompt user for input
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            System.out.print("Please enter one of the symbols (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            // Calculate result based on user input
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            // Ask if the user wants to continue
            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().charAt(0);
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
    }

