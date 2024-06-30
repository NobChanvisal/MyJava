package minimenu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * checkingAcc
 */
public class checkingAcc {
    Scanner input = new Scanner(System.in);
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";
    public void displayChecking() {
        int option;
        do{
            System.out.println();
            System.out.println("Checking Account:");
            System.out.println("-----------------------");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.print("Choice > ");
            System.out.print(GREEN);
            option = input.nextInt();
            System.out.print(RESET);
            switch (option) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }while(option != 4);
    }
    public long checkingAccMoney;
    public void viewBalance() {
        File file = new File("CheckingAcc.txt");
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            if (line != null) {
                checkingAccMoney = Long.parseLong(line);
            }
            System.out.println("Checking Account balance: $" + checkingAccMoney);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading balance: " + e.getMessage());
        }
    }

    public void deposit() {
        viewBalance();
        System.out.print("Amount you want to deposit into Checking Account: ");
        System.out.print(GREEN);
        long depositMoney = input.nextLong();
        System.out.print(RESET);

        // Update the balance
        checkingAccMoney += depositMoney;

        // Write the updated balance back to the file
        try (FileWriter writer = new FileWriter("CheckingAcc.txt")) {
            writer.write(String.valueOf(checkingAccMoney));
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        System.out.print("New ");viewBalance();
    }
    public void withdraw(){
        viewBalance();
        System.out.print("Amount you want to withdraw from Checking Account: ");
        System.out.print(GREEN);
        long withdrawMoney = input.nextLong();
        System.out.print(RESET);
        // Update the balance
        checkingAccMoney -= withdrawMoney;
        // Write the updated balance back to the file
        try (FileWriter writer = new FileWriter("CheckingAcc.txt")) {
            writer.write(String.valueOf(checkingAccMoney));
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        System.out.print("New ");viewBalance();
    }
}