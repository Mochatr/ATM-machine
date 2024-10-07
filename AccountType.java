import java.util.Scanner;

public class AccountType {
    public static void main(String[] args) {
        // Create an object for the credentials
        Scanner credObj = new Scanner(System.in);
        try {
            System.out.print("Welcome to the ATM Project! \n"
            + "Enter your account number");
            int userNum = credObj.nextInt();

            System.out.print("Enter your PIN Number! ");
            int userPin = credObj.nextInt();
            
        } finally {
            credObj.close();
        }
    }
}