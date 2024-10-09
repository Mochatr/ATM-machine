import java.util.Scanner;

public class AtmMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ATM Service");

        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        if (isValidCredentials(accountNumber, pin)) {
            welcomeUser();
        } else {
            System.out.println("Invalid credentials, please try again.");
            // Optionally, loop back to credential input or exit
        }

        // Prompt the user to select an account
        selectAccountType(scanner);
        // Prompt the user to select an operation
    }

    private static boolean isValidCredentials(String accountNumber, String pin) {
        return accountNumber.matches("\\d{8}") && pin.matches("\\d{4}");
    }

    private static void welcomeUser() {
        System.out.println("Welcome to your account");
        // Proceed to account type selection
    }

    private static void selectAccountType(Scanner scanner) {
        while (true) {
            System.out.println("Choose account type:");
            System.out.println("1. Checking Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manageCheckingAccount(scanner);
                    break;
                case 2:
                    manageSavingAccount(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using our ATM service!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid option.");
                    selectAccountType(scanner);
            }
        }
    }    

    private static void manageCheckingAccount(Scanner scanner) {
        System.out.println("Checking Account Operations:");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        System.out.print("Choice: ");

        int choice = scanner.nextInt();
        // Implement operations based on user choice
        int balance = 500;
        int deposit = 0;
        int withdraw;

        // Create an obj to handle various account operations.
        Scanner myObj = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Balance: $" + balance);
                break;
            case 2:
                System.out.print("Make your Deposit: ");
                deposit = myObj.nextInt();

                balance += deposit;
                System.out.println("Your deposit has been added successfully! Current balance: $" + balance);
                break;
            case 3:
                System.out.print("How much would you like to withdraw ?: ");
                withdraw = myObj.nextInt();
                
                balance -= withdraw;
                System.out.println("Your withdrawl was done successfully! Current balance: $" + balance);
                break;
            default:
                System.out.println("Thank you for using our ATM service!");
                System.exit(0);
                selectAccountType(scanner);
        }
    }
    
    private static void manageSavingAccount(Scanner scanner) {
        // Similar structure to manageCheckingAccount
        System.out.println("Checking Account Operations:");
        System.out.println("1. View Savings");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        // Implement operations based on user choice

        int balance = 10000;
        int deposit = 0;
        int withdraw;

        // Create an obj to handle various account operations.
        Scanner myObj = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Savings: $" + balance);
                break;
            case 2:
                System.out.println("Make your Deposit:");
                deposit = myObj.nextInt();

                balance += deposit;
                System.out.println("Your deposit has been added successfully! Current balance: $" + balance);
                break;
            case 3:
                System.out.println("How much would you like to withdraw ?");
                withdraw = myObj.nextInt();
                
                balance -= withdraw;
                System.out.println("Your withdrawl was done successfully! Current balance: $" + balance);
                break;
            default:
                System.out.println("Thank you for using our ATM service!");
                System.exit(0);
                selectAccountType(scanner);
        }
    }
}