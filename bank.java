import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;

    public BankAccount(String accountNumber, String accountHolderName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void changePin(int newPin) {
        pin = newPin;
        System.out.println("PIN changed successfully");
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.0, 1234);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == myAccount.getPin()) {
            System.out.println("1. Deposit\n2. Withdraw\n3. Change PIN");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawalAmount);
                    break
