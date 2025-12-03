package Lab2;
import java.util.Scanner;
public class Lab2_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String inputOwnerName = scanner.nextLine();
        double inputBalance = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();

        BankAccount2 myAccount = new BankAccount2(inputOwnerName, inputBalance);

        myAccount.withdraw(withdrawAmount1);
        myAccount.withdraw(withdrawAmount2);
        myAccount.displayBalance();

        scanner.close();
	}

}

class BankAccount2 {
    String ownerName;
    double balance;

    BankAccount2(String name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}