import java.util.Scanner;
import java.util.function.*;
public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = sc.nextDouble();

    // Ask the user to enter an operator (+, -, *, /)
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);

    // Declare a variable to store the result
    double result;

    // Use a switch statement to perform the calculation based on the operator
    switch (operator) {
      // Case for addition
      case '+':
        result = num1 + num2;
        break;
      // Case for subtraction
      case '-':
        result = num1 - num2;
        break;
      // Case for multiplication
      case '*':
        result = num1 * num2;
        break;
      // Case for division
      case '/':
        // Check if the second number is zero to avoid division by zero error
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          // Display an error message and end the program
          System.out.println("Cannot divide by zero");
          return;
        }
        break;
      // Default case for invalid operator
      default:
        // Display an error message and end the program
        System.out.println("Invalid operator");
        return;
    }

    // Display the result of the calculation
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}