/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jayanthi.theaterticketbookingsystem;
import java.util.Scanner;

public class TheatreTicketBookingSystem {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TicketBooking booking = new TicketBooking();

        while (true) {

            System.out.println("\n===== THEATER TICKET BOOKING SYSTEM =====");

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Seats");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Seat Number : ");
                    int seatNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    String name = sc.nextLine();

                    booking.bookTicket(seatNo, name);

                    break;

                case 2:

                    System.out.print("Enter Seat Number : ");
                    int cancelSeat = sc.nextInt();

                    booking.cancelTicket(cancelSeat);

                    break;

                case 3:

                    booking.displaySeats();

                    break;

                case 4:

                    System.out.println("Thank You!");

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
       
    }
}
        
    
