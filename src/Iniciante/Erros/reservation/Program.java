package Iniciante.Erros.reservation;

import Iniciante.Erros.reservation.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Room Number: ");
        int roomNumber=sc.nextInt();

        System.out.print("Enter Check-In date: ");
        sc.nextLine();
        Date checkIn=sdf.parse(sc.nextLine());

        System.out.print("Enter Check-Out date: ");
        Date checkOut=sdf.parse(sc.nextLine());

//        if(checkIn.getTime()>checkOut.getTime()){
//            System.out.println("Erro");
//        }else{
//            System.out.println("ok");
//        }

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else{
            Reservation reservation= new Reservation(roomNumber,checkIn,checkOut);
            System.out.println("Reservaion"+reservation);

            System.out.println();
            System.out.print("Enter Check-In date: ");
            sc.nextLine();
            checkIn=sdf.parse(sc.nextLine());
            System.out.print("Enter Check-Out date: ");
            checkOut=sdf.parse(sc.nextLine());

            Date now= new Date();
            if (checkIn.before(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
;
        }

        sc.close();
    }
}
