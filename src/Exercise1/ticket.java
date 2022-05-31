package Exercise1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ticket {
    float ticket_price = 100, total_price;
    int booked_seat, available_seat = 3;
    String coach_type, departure = "Kamlapur", arrival, date, departure_time = "10 AM", arrival_time = "11:30 AM";

    Scanner get = new Scanner(System.in);

    void get_ticket_info() {

        System.out.println("Travel to (Local): ");
        arrival = get.nextLine();
        System.out.println("Date (DD/MM/YY) : ");
        date = get.nextLine();
        System.out.println("Enter number of seat: ");
        booked_seat = get.nextInt();
    }

    void total_price() {
        total_price = ticket_price * booked_seat;

        if (total_price > 200) {
            total_price = (float) (0.9 * total_price);
        }
    }
    void print_ticket_info(){
        System.out.println("Departure place: " + departure);
        System.out.println("Total price: " + total_price);
        if(booked_seat>3){
            System.out.println("Available seat is 3 ");
        }
    }
}
