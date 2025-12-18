import java.util.Scanner;

public class BankWitdrawl {
    public static void main(String[] args) {
        double balance = 5000.0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric amount.");
        }
    }
}
