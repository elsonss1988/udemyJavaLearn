package Iniciante.Erros.reservation;

import Iniciante.Erros.reservation.entities.Reservation;
import Iniciante.Erros.reservation.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Enter Check-In date: ");
            sc.nextLine();
            Date checkIn = sdf.parse(sc.nextLine());

            System.out.print("Enter Check-Out date: ");
            Date checkOut = sdf.parse(sc.nextLine());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation" + reservation);

            System.out.println();
            System.out.print("Enter Check-In date: (dd/MM/yyyy) ");
            checkIn = sdf.parse(sc.nextLine());
            System.out.print("Enter Check-Out date: (dd/MM/yyyy) ");
            checkOut = sdf.parse(sc.nextLine());

            reservation.updateDates(checkIn, checkOut);
            System.out.println();
        }catch(ParseException e){
            System.out.println("Invalid date format: ");
        }catch(DomainException e){
            System.out.println("Error in reservation: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Unexpected Error");
        }
        sc.close();
    }
}
