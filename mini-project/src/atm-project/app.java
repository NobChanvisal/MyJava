import java.util.Scanner;
import minimenu.checkingAcc;
public class app {
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the ATM Machine");
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Your Customer Number : ");
            long cusNum = input.nextLong();
            System.out.print("Enter Your Pin Number : ");
            long pinNum = input.nextLong();

            int option;
            do {
                System.out.println();
                System.out.println("----------------------------");
                System.out.println("Select the Account you want to access : ");
                System.out.println("Type 1 - Checking Account");
                System.out.println("Type 2 - Saving Account");
                System.out.println("Type 3 - Exit");
                
                System.out.print("Choice > ");
                System.out.print(GREEN);
                

                // Check if there is an integer input available
                if (input.hasNextInt()) {
                    System.out.print(RESET);
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            checkingAcc checkAcc = new checkingAcc();
                            checkAcc.displayChecking();
                            System.out.println("You selected Option 1: ");
                            // Call checking account logic here
                            break;
                        case 2:
                            System.out.println("You selected Option 2: ");
                            // Call saving account logic here
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next(); // consume invalid input
                    option = 0; // set option to a default value
                }

            } while (option != 3);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            input.close(); // Always close the scanner to release resources
        }
    }
}
