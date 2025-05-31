//import javax.sound.midi.Soundbank;
//import java.util.Scanner;
//
//public class BankingApplication {
//    static Scanner sc = new Scanner(System.in);
//    static double balance=0;
//    public static void main(String[] args){
//
//
//         //variable declaration
//
//        int choice;
//        boolean isrunning=true;
//
//
//        //welcome msg
//
//       while (isrunning){
//           System.out.println("*******************************");
//           System.out.println("Welcome to the Bank Application :");
//           System.out.println("Choose a option from following ( 1 - 4 ):");
//           System.out.println("1.Show Bank Balance \n2.Deposit Money \n3.Withdraw Amount \n4.Exit");
//           System.out.println("******************************* \nEnter your choice :");
//           //User input
//           choice=sc.nextInt();
//
//           switch(choice){
//               case 1 -> showbalance(balance);
//               case 2 -> deposit();
//               case 3 ->withdraw(balance);
//               case 4 ->isrunning=false;
//
//               default -> System.out.println("Invalid Operation....!");
//           }
//           System.out.println("Thanks For using The Bank application...");
//
//       }
//
//       //deposit Money()
//
//         //Show Balance()
//
//        //withdraw money()
//
//        //exit()
//
//    }
//    static void showbalance(double balance){
//        System.out.println("********************");
//        System.out.printf("$%.2f ",balance);
//    }
//
//    static double deposit(){
//        double amount;
//        System.out.println("*********************");
//        System.out.println("Enter the amount you want to deposit :");
//        amount=sc.nextDouble();
//
//        if (amount<0){
//            System.out.println("amount cannot be negative...!");
//        } else {
//            System.out.println("Amount has successfully added to you bank....");
//            balance+=amount;
//            System.out.println("Your updated balance is "+balance);
//        }
//        return balance;
//
//
//    }
//
//    static double withdraw(double balance){
//        double amount;
//        System.out.println("*********************");
//        System.out.println("Enter the amount you want to Withdraw :");
//        amount=sc.nextDouble();
//
//        if (amount<0){
//            System.out.println("amount cannot be negative...!");
//        } else if (amount>balance){
//            System.out.println("Amount is cannot be greater than balance...");
//
//        }
//        else {
//            System.out.println("Amount has successfully Withdrawn from account....");
//            balance-=amount;
//            System.out.println("Your updated balance is "+balance);
//        }
//
//        return 0;
//    }
//
//
//
//
//} below is the corrected
import java.util.Scanner;

public class BankingApplication {
    static Scanner sc = new Scanner(System.in);
    static double balance = 0.0;

    public static void main(String[] args) {
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n===============================");
            System.out.println("Welcome to the Bank Application");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1–4): ");

            // Validate integer input
            if (!sc.hasNextInt()) {
                sc.nextLine();  // consume invalid token
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    showBalance();
                }
                case 2 -> {
                    // deposit() returns the new balance; we capture it
                    balance = deposit();
                }
                case 3 -> {
                    // withdraw(...) returns the new balance; we capture it
                    balance = withdraw(balance);
                }
                case 4 -> {
                    System.out.println("Thank you for using the Bank Application. Goodbye!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        }

        sc.close();
    }

    // Method no longer needs a parameter; it can just read the static field directly.
    static void showBalance() {
        System.out.println("------------------------------");
        System.out.printf("Current balance: $%.2f%n", balance);
        System.out.println("------------------------------");
    }

    // Return the updated balance. Every branch returns some value.
    static double deposit() {
        System.out.println("------------------------------");
        System.out.print("Enter the amount you want to deposit: ");
        if (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Invalid amount. Returning to menu.");
            return balance;  // no change
        }
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative. No changes made.");
            return balance;  // no change
        } else {
            balance += amount;  // update the static field
            System.out.printf("Successfully deposited $%.2f%n", amount);
            System.out.printf("New balance: $%.2f%n", balance);
            return balance;     // return updated balance
        }
    }

    // Pass in the current balance; return the new balance.
    static double withdraw(double bal) {
        System.out.println("------------------------------");
        System.out.print("Enter the amount you want to withdraw: ");
        if (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Invalid amount. Returning to menu.");
            return bal;    // no change
        }
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative. No changes made.");
            return bal;    // no change
        } else if (amount > bal) {
            System.out.println("Insufficient funds. Current balance: $" + bal);
            return bal;    // no change
        } else {
            bal -= amount;
            balance = bal;      // update the static field
            System.out.printf("Successfully withdrew $%.2f%n", amount);
            System.out.printf("New balance: $%.2f%n", balance);
            return bal;         // return updated balance
        }
    }
}
