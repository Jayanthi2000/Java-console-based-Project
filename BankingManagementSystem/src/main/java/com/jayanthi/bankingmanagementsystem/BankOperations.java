/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayanthi.bankingmanagementsystem;

import java.util.ArrayList;


public class BankOperations {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    // Create Account
    public void createAccount(BankAccount account) {

        accounts.add(account);

        System.out.println("Account Created Successfully!");
    }

    // Deposit
    public void deposit(int accountNumber, double amount) {

        for (BankAccount account : accounts) {

            if (account.accountNumber == accountNumber) {

                account.balance += amount;

                System.out.println("Amount Deposited Successfully!");

                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    // Withdraw
    public void withdraw(int accountNumber, double amount) {

        for (BankAccount account : accounts) {

             if (account.accountNumber == accountNumber) {

                if (account.balance >= amount) {

                    account.balance -= amount;

                    System.out.println("Withdrawal Successful!");

                } else {

                    System.out.println("Insufficient Balance!");
                }

                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    // Check Balance
    public void checkBalance(int accountNumber) {

        for (BankAccount account : accounts) {

            if (account.accountNumber == accountNumber) {

                System.out.println("Current Balance : " + account.balance);

                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    // Display All Accounts
    public void displayAllAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No Accounts Available!");

            return;
        }

        for (BankAccount account : accounts) {

            account.displayAccount();

            System.out.println("----------------------");
        }
    }
}
