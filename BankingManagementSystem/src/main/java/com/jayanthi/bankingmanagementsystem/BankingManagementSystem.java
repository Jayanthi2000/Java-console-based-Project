package com.jayanthi.bankingmanagementsystem;


import java.util.Scanner;

public class BankingManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankOperations bank = new BankOperations();

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");

            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Account Number : ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance : ");
                    double balance = sc.nextDouble();

                    BankAccount account =
                            new BankAccount(accNo, name, balance);

                    bank.createAccount(account);
                }

                case 2 -> {
                    System.out.print("Enter Account Number : ");
                    int depositAcc = sc.nextInt();

                    System.out.print("Enter Deposit Amount : ");
                    double depositAmount = sc.nextDouble();

                    bank.deposit(depositAcc, depositAmount);
                }

                case 3 -> {
                    System.out.print("Enter Account Number : ");
                    int withdrawAcc = sc.nextInt();

                    System.out.print("Enter Withdraw Amount : ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(withdrawAcc, withdrawAmount);
                }

                case 4 -> {
                    System.out.print("Enter Account Number : ");
                    int balanceAcc = sc.nextInt();

                    bank.checkBalance(balanceAcc);
                }

                case 5 -> bank.displayAllAccounts();

                case 6 -> {
                    System.out.println("Thank You!");

                    System.exit(0);
                }

                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
