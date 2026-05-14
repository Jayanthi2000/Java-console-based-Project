/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayanthi.bankingmanagementsystem;

public class BankAccount {

    int accountNumber;
    String name;
    double balance;

    public BankAccount(int accountNumber, String name, double balance) {

        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void displayAccount() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance : " + balance);
    }
}
