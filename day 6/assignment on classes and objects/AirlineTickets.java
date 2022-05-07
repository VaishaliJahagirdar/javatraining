/* 4.Create a class that captures airline tickets. Each ticket lists the departure and arrival cities,
 a flight number, and a seat assignment. A seat assignment has both a row and a letter for the seat 
within the row (such as 12F). Make two examples of tickets.*/


import java.util.*;
         class AirlineTickets
        {
            public String Departure;
            public String Arrival;
            public String FlightNumber;
            public int SeatRow;
            public char SeatLetter;

            // constructor of AirlineTickets
            public AirlineTickets(String departure, String arrival, String flightNumber, int seatRow, char seatLetter)
            {
                Departure = departure;
                Arrival = arrival;
                FlightNumber = flightNumber;
                SeatRow = seatRow;
                SeatLetter = seatLetter;
            }

            // Output data about AirlineTickets to console
            public void Display()
            {
                System.out.println("Airline Tickets: Departure: {0}, Arrival: {1}, FlightNumber: {2}, Seat: {3}{4}"
                 +Departure +Arrival +FlightNumber +SeatRow +SeatLetter);
            }
        }
        class Excersise4{
        
       public static void main(String[] args)
        {
            // Make objects
            AirlineTickets ticket1 = new AirlineTickets("CDG", "FCO", "AFR28PP", 12, 'A'); ;
            AirlineTickets ticket2 = new AirlineTickets("PTY", "CDG", "AFR475", 9, 'F'); ;

            // Display data
            ticket1.Display();
            ticket2.Display();
        }
    }
