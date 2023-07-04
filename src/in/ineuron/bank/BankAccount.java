package in.ineuron.bank;
import java.util.*;

public class BankAccount {
	private double balance;

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) {
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited successfully.");
            } else {
                System.out.println("Invalid amount. Please enter a positive / greater than 0 value.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance. Cannot withdraw.");
                }
            } else {
                System.out.println("Invalid amount. Please enter a positive / greater than 0 value.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
