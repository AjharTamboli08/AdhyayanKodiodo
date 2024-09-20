


import java.util.Scanner;

public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative!");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
            System.out.println("New balance: " + balance);
        }
    }
Test case 1 :
    Input 28
    Output : Factores of 28 (excluding 1 and 28)
    public static void main(String[] args) {
        Bank bankAccount = new Bank(1000.00);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to deposit:");
        double amount = scanner.nextDouble();

        try {
            bankAccount.deposit(amount);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
