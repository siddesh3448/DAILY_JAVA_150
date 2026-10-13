/* 
Problem 3 — Bank Account
Easy–Medium
Filename: BankAccount.java
Create a class named Account:
1. Fields: accountHolder (String) and balance (double).
2. Constructor to initialize both fields.
3. Method deposit(double amount) that adds the amount to the balance.
4. Method withdraw(double amount) that subtracts the amount only if the balance is sufficient; otherwise, print "Insufficient balance".
5. Method displayBalance() that prints the current balance.
6. Create one account with a balance of ₹1,000. Deposit ₹500, withdraw ₹300, and display the final balance.
Expected final balance: 1200.0.
Recall focus: Parameters, updating an object's field, and methods that use void.
*/
import java.util.Scanner;
class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance : $" + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Houlders Name : ");
        String name = sc.next();

        System.out.print("Enter Balance of your Account : ");
        double balance = sc.nextDouble();

        System.out.print("Enter your deposit amount : ");
        double deposit = sc.nextDouble();

        System.out.print("Enter your withdrwal amout : ");
        double withdrawAmount = sc.nextDouble();

        Account Bank = new Account(name, balance);
        Bank.deposit(deposit);
        Bank.withdraw(withdrawAmount);
        Bank.displayBalance();

        sc.close();
    }
}
