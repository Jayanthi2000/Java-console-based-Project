/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayanthi.theaterticketbookingsystem;

public class Ticket {

    int seatNumber;
    String customerName;
    boolean booked;

    public Ticket(int seatNumber) {

        this.seatNumber = seatNumber;
        this.booked = false;
    }
}
