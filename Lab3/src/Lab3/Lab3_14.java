package Lab3;
import java.util.Scanner;

class BankAccount3 {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount3(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}


public class Lab3_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankAccount3 myAccount = null;

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String command = sc.next();

                if (command.equals("CREATE")) {
                    double initialDeposit = sc.nextDouble();
                    myAccount = new BankAccount3(initialDeposit);

                } else if (command.equals("DEPOSIT")) {
                    double amount = sc.nextDouble();
                    if (myAccount != null) {
                        myAccount.deposit(amount);
                    } else {
                        System.out.println("No account exists.");
                    }

                } else if (command.equals("WITHDRAW")) {
                    double amount = sc.nextDouble();
                    if (myAccount != null) {
                        myAccount.withdraw(amount);
                    } else {
                        System.out.println("No account exists.");
                    }

                } else if (command.equals("STATUS")) {
                    if (myAccount != null) {
                        System.out.println("Balance: " + myAccount.getBalance());
                    } else {
                        System.out.println("No account exists.");
                    }

                } else if (command.equals("GLOBAL_STATUS")) {
                    System.out.println("Total Transactions: " + BankAccount3.getTotalTransactionCount());
                }
            }
        }
        sc.close();
    }
}
