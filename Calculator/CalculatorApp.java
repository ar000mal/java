import java.util.Scanner;

class Calculator {
    double add(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                break;
            case 2:
                result = calc.subtract(num1, num2);
                break;
            case 3:
                result = calc.multiply(num1, num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    sc.close();
                    return;
                }
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
