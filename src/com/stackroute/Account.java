package com.stackroute;
/*
Program 5
        Create a class Account. That has following variable and method
        accountBalance : double
        Write the Constructor
        Write Getter and Setter for the variable accountBalance
        Implement the method:
        withdraw(double amount) : double

        This method returns the new balance deducting the withdraw amount from the balance
        Throws NegativeIntegerException when amount to withdraw is less than zero
        Throws InsufficientFundException when amount to withdraw is greater than the balance
        * @param amount
        * @return
        * @throws InsufficientFundException
        * @throws NegativeIntegerException
        Custom exceptions should be used for below scenarios

        Withdrawing amount from the given bank account less than zero should throw NegativeIntegerException
        Withdrawing amount from the given bank account greater than the balance should throw InsufficientFundException
*/

import java.util.*;

public class Account {
    static double accountBalance;
    static Account account;

    //Constructor for Account
    public Account() {

    }

    //Parameterised Constructor for Account balance
    public Account(double accountBalance) {
        this.accountBalance += accountBalance;
    }

    //Getter Method for accountBalance
    public double getAccountBalance() {
        return accountBalance;
    }

    //Setter Method for accountBalance
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    //Withdraw method
    public static double withdraw(double amount) {
        double leftBalance = 0;
        if (account.getAccountBalance() < 0 || amount > account.getAccountBalance())
            try {
                throw new InsufficientFundException("Insufficient Fund");
            } catch (InsufficientFundException e) {
                e.printStackTrace();
            }
        else if (amount < 0)
            try {
                throw new NegativeIntegerException("Negative amount");
            } catch (NegativeIntegerException e) {
                e.printStackTrace();
            }
        else {
            leftBalance = account.getAccountBalance() - amount;
        }
        return leftBalance;
    }

    //Main Method Driver Code
    public static void main(String[] args) {
        account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the money to be deposited in your Account");
        account.setAccountBalance(scanner.nextInt());
        System.out.println("Enter the amount of money to be withdrawn.");
        double balanceLeft = withdraw(scanner.nextInt());
        System.out.println("Remaining Balance " + balanceLeft);
    }
}

//Custom Exception NegativeIntegerException
class NegativeIntegerException extends Exception {
    NegativeIntegerException(String message) {
        super(message);
    }
}

//Custom Exception InsufficientFundException
class InsufficientFundException extends Exception {
    InsufficientFundException(String message) {
        super(message);
    }
}