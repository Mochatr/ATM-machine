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
    }

    private static boolean isValidCredentials(String accountNumber, String pin) {
        return accountNumber.matches("\\d{8}") && pin.matches("\\d{4}");
    }

    private static void welcomeUser() {
        System.out.println("Welcome to your account");
        // Proceed to account type selection
    }

    private static void selectAccountType(Scanner scanner) {
        System.out.println("Choose account type:");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                manageCheckingAccount(scanner);
                break;
            case 2:
                manageSavingAccount(scanner);
                break;
            case 3:
                System.out.println("Exiting... Thank you for using our ATM service!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, please enter a valid option.");
                selectAccountType(scanner);
        }
    }    

    private static void manageCheckingAccount(Scanner scanner) {
        System.out.println("Checking Account Operations:");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        int operation = scanner.nextInt();
        // Implement operations based on user choice
    }
    
    private static void manageSavingAccount(Scanner scanner) {
        // Similar structure to manageCheckingAccount
    }
}