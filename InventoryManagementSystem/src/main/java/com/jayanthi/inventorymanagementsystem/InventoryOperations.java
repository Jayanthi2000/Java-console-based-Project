/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayanthi.inventorymanagementsystem;


import java.util.ArrayList;

public class InventoryOperations {

    ArrayList<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {

        products.add(product);

        System.out.println("Product Added Successfully!");
    }

    // Display Products
    public void displayProducts() {

        if (products.isEmpty()) {

            System.out.println("No Products Available!");

            return;
        }

        for (Product product : products) {

            product.displayProduct();
        }
    }

    // Search Product
    public void searchProduct(int productId) {

        for (Product product : products) {

            if (product.productId == productId) {

                product.displayProduct();

                return;
            }
        }

        System.out.println("Product Not Found!");
    }

    // Update Quantity
    public void updateQuantity(int productId, int quantity) {

        for (Product product : products) {

            if (product.productId == productId) {

                product.quantity = quantity;

                System.out.println("Quantity Updated Successfully!");

                return;
            }
        }

        System.out.println("Product Not Found!");
    }

    // Delete Product
    public void deleteProduct(int productId) {

        for (Product product : products) {

            if (product.productId == productId) {

                products.remove(product);

                System.out.println("Product Deleted Successfully!");

                return;
            }
        }

        System.out.println("Product Not Found!");
    }
}
