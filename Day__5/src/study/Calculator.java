// Write a class Calculator in a package study                               
// Add following static method to the class which per calculation and return the result as per operator
// public static int calculate(int number1, int number2, String operator);
// List of valid operator (+, -, *, /, %)
// If any other operator is passed then throw a custom checked exception "WrongOperatorException" 
// Demonstrate use of Calculator class in main.



package study;

public class Calculator {
    public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return number1 / number2;
            case "%":
                if (number2 == 0) {
                    throw new ArithmeticException("Modulo by zero is not allowed");
                }
                return number1 % number2;
            default:
                // If operator is invalid
                throw new WrongOperatorException("Invalid operator: " + operator);
        }
    }
}

