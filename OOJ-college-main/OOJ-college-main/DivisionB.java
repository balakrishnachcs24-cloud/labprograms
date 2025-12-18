import java.util.Scanner;

public class DivisionB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            double num = sc.nextDouble();

            System.out.print("Enter denominator: ");
            double den = sc.nextDouble();

            double result = num / den;  // Java throws ArithmeticException when dividing by 0 for integers
            if (den == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
    }
}
