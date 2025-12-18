public class Account {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAccountNumber("123456789");
        acc.setBalance(1500.75);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}
