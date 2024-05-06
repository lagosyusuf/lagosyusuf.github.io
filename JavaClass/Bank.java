import java.util.Scanner;


public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Customer name");
        String custName = scan.nextLine();
        System.out.println("Enter Customer ID");
        String customerId = scan.nextLine();

        Account account = new Account(custName, customerId);

        System.out.println("****************************************");
        System.out.println("Welcome " + account.customerName + "!");
        System.out.println("Your Customer ID is " + account.customerID);
        System.out.println("****************************************");
        System.out.println();
        System.out.println("########################################");
        System.out.println("Select Any Option To Proceed");
        System.out.println("########################################");
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Interest Rate");
        System.out.println("F. Exit");

        char option; // char data type to variable accept user option's 
        boolean flag = true; // boolean flag to indicate loop in and exit
        
        while (flag) {
            System.out.println();
            System.out.println("Enter Your Choice");
            option = scan.next().charAt(0); // syntax to accept a single character as an input

            switch (option) {
                case 'A': System.out.println("Account balance is: " + account.balance); break;
                
                case 'B': System.out.println("Enter amount to deposit");
                int depositAmount = scan.nextInt();System.out.println();
                account.deposit(depositAmount); break;

                case 'C': System.out.println("Enter amount to withdraw");
                int withdrawAmount = scan.nextInt();
                account.withdraw(withdrawAmount); break;

                case 'D': account.getPreviousTransaction(); break;

                case 'E': System.out.println("Enter the year for wish you calculate the interest rate: ");
                int year = scan.nextInt();
                account.calculateInterestRate(year); break;

                case 'F': System.out.println("Thank you for banking with us!");
                scan.close();
                flag = false; break;
                default: 
                System.out.println("Error: Invalid Options. Please enter A, B, C, D or E to access services.");
            }
        }

    }
}
