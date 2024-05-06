public class Account {
    String customerName; // customer user name
    String customerID; // customer user identifier
    int balance = 0; // customer balance
    int previousTransaction = 0; //customer previous transaction

    Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount; //balance updated
            previousTransaction = amount; //previous transaction
            System.out.println("Amount Deposited Successfully");
            System.out.println("New Balance is: " + previousTransaction);
        }
    }

    void withdraw(int amount) {
        if (amount < balance) {
            if (amount > 0) {
                balance = balance - amount;
                previousTransaction = -amount;
                System.out.println("Withdrawal Successfully");
                System.out.println("New Balance is: " + previousTransaction);
        }
        else {
            System.out.println("Please enter amount greater than 0");
        }
    } else {
        System.out.println("Amount entered is insufficient");
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + previousTransaction);
        }
        else {
            System.out.println("No Transaction Occurred");
        }
    }

    void calculateInterestRate(int years) {
        double interestRate = .0815;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, the interest rate is " + newBalance);
    }
    
}
