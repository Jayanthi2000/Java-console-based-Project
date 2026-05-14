/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayanthi.inventorymanagementsystem;

public class Product {

    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName,
                   int quantity, double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayProduct() {

        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);

        System.out.println("----------------------");
    }
}
