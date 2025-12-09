// Christina F
// ATM Machine 
// 11/11/25

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // accounts with IDs 0–9 and $100 balance
        AccountClass[] accounts = new AccountClass[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new AccountClass(i, 100);
        }

        // infinite loop 
        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            //validate ID
            while (id < 0 || id >= accounts.length) {
                System.out.print("Invalid id. Please enter a correct id (0–9): ");
                id = input.nextInt();
            }

            // Step 4: Main menu for the current user
            while (true) {
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("5: log out");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } 
                else if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = input.nextDouble();
                    accounts[id].withdraw(amount);
                } 
                else if (choice == 3) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    accounts[id].deposit(amount);
                } 
                else if (choice == 4) {
                    System.out.println("Exiting to main login...\n");
                    break; // alllows the user to exit the inner menu loop, go back to ID prompt
                }
                else if (choice == 5) {
                    System.out.println("Thank you for using the ATM. Adiosss!");
                    System.exit(0); // exits the entire program
                }else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
