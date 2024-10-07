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
}