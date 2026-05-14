/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jayanthi.inventorymanagementsystem;
import java.util.Scanner;

public class InventoryManagementSystem {

 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventoryOperations inventory = new InventoryOperations();

        while (true) {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Product ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity : ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    Product product =
                            new Product(id, name, quantity, price);

                    inventory.addProduct(product);
                }

                case 2 -> inventory.displayProducts();

                case 3 -> {
                    System.out.print("Enter Product ID : ");
                    int searchId = sc.nextInt();

                    inventory.searchProduct(searchId);
                }

                case 4 -> {
                    System.out.print("Enter Product ID : ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity : ");
                    int newQuantity = sc.nextInt();

                    inventory.updateQuantity(updateId, newQuantity);
                }

                case 5 -> {
                    System.out.print("Enter Product ID : ");
                    int deleteId = sc.nextInt();

                    inventory.deleteProduct(deleteId);
                }

                case 6 -> {
                    System.out.println("Thank You!");

                    System.exit(0);
                }

                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
