import java.util.Scanner;

public class ATM_Interface {
    private static double balance = 1000.00; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for visiting the Bank!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount you have to withdraw : ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Your Balance is too low.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: " + balance);
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}
