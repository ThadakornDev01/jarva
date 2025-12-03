package Lab2;

import java.util.Scanner;

public class Lab2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputownerName = scanner.nextLine();
        double inputbalance = scanner.nextDouble();
        double inputamount = scanner.nextDouble();

        BankAccount BA = new BankAccount(inputownerName, inputbalance);
        BA.deposit(inputamount);
        BA.displaySummary();
        scanner.close();
    }
}

class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String owN, double bal) {
        ownerName = owN;
        balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
        return balance;
    }
}