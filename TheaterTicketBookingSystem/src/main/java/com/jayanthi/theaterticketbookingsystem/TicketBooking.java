/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayanthi.theaterticketbookingsystem;



import java.util.ArrayList;

public class TicketBooking {

    ArrayList<Ticket> tickets = new ArrayList<>();

    public TicketBooking() {

        for (int i = 1; i <= 10; i++) {

            tickets.add(new Ticket(i));
        }
    }

    // Book Ticket
    public void bookTicket(int seatNumber, String customerName) {

        for (Ticket ticket : tickets) {

            if (ticket.seatNumber == seatNumber) {

                if (!ticket.booked) {

                    ticket.booked = true;
                    ticket.customerName = customerName;

                    System.out.println("Ticket Booked Successfully!");

                } else {

                    System.out.println("Seat Already Booked!");
                }

                return;
            }
        }

        System.out.println("Invalid Seat Number!");
    }

    // Cancel Ticket
    public void cancelTicket(int seatNumber) {

        for (Ticket ticket : tickets) {

            if (ticket.seatNumber == seatNumber) {

                if (ticket.booked) {

                    ticket.booked = false;
                    ticket.customerName = null;

                    System.out.println("Ticket Cancelled Successfully!");

                } else {

                    System.out.println("Seat Not Booked Yet!");
                }

                return;
            }
        }

        System.out.println("Invalid Seat Number!");
    }

    // Display Seats
    public void displaySeats() {

        System.out.println("\n===== SEAT STATUS =====");

        for (Ticket ticket : tickets) {

            if (ticket.booked) {

                System.out.println("Seat " + ticket.seatNumber +
                        " - Booked by " + ticket.customerName);

            } else {

                System.out.println("Seat " + ticket.seatNumber +
                        " - Available");
            }
        }
    }
}
