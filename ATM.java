/*  Practical 04:  ATM Machine Simulation (Custom Exception): Develop a Java program to simulate an ATM
machine. Implement operations like withdrawal, deposit, and balance inquiry. Throw a custom
exception InsufficientBalanceException if the user tries to withdraw more than the balance.
Demonstrate checked and unchecked exceptions. Also display the count of the users who used
ATM to perform transaction. (Use concept of Encapsulation (Class, objects, methods) for creation
of Account class, static data member, static block and static method). */


import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {

    private
    int accountNumber;
    double initialBalance;


    ATM(int initialBalance) {
        balance = initialBalance;
    }

    int balance;
    public static int Count;

    static {
        Count = 0;
    }

    void accept() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
         initialBalance = sc.nextInt();

    }

    void display() {
        System.out.println("Hello User, Welcome to ATM Machine");
        System.out.println("Your Account Number is: " + accountNumber);
        System.out.println("Your Initial Balance is: " + initialBalance);
    }

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful.");
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
    }

    void balanceInquiry() {
        System.out.println("Current Balance: " + balance);
    }

    int getBalance() {
        return balance;
    }

    public static void main(String args[]) {

        ATM obj = new ATM(0);

        obj.accept();
        obj.display();

        int ch, x;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    obj.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    try {
                        obj.withdraw(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    obj.balanceInquiry();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM Machine.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (ch != 0);

        System.out.println("Total number of users who used ATM: " + ATM.Count);
    }
}