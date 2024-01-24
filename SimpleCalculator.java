import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Select operation
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter operation number (1-4): ");
        int operation = scanner.nextInt();

        // Perform calculation based on the selected operation
        double result = 0.0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                // Check if the second number is not zero for division
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return; // Exit the program if division by zero is attempted
                }
                break;
            default:
                System.out.println("Error: Invalid operation number.");
                return; // Exit the program if an invalid operation is selected
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
