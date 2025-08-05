import java.util.Scanner;

public class BankSystem {
    private static double balance = 1000.0; // Initial balance for the account
    private static int pin = 1234; // Initial PIN for the account

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Change PIN");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    changePIN();
                    break;
                case 4:
                    miniStatement();
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void changePIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current PIN: ");
        int currentPIN = scanner.nextInt();

        if (currentPIN == pin) {
            System.out.print("Enter your new PIN: ");
            int newPIN = scanner.nextInt();
            pin = newPIN;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect PIN. PIN change failed.");
        }
    }

    private static void miniStatement() {
        System.out.println("Mini Statement:");
        System.out.println("Current Balance: $" + balance);
    }
}
