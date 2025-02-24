import java.util.Scanner;

//  Program to Model a Movie Ticket Booking System

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("\n---------- Ticket Details ----------");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();
        System.out.println("Welcome to Movie Ticket Booking System!");
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter ticket price: $");
        double price = sc.nextDouble();

        ticket.bookTicket(movieName, seatNumber, price);

        ticket.displayTicketDetails();
}
}