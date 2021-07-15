package Iniciante.intefarce.rentcar;

import Iniciante.intefarce.rentcar.model.entities.CarRental;
import Iniciante.intefarce.rentcar.model.entities.Vehicle;
import Iniciante.intefarce.rentcar.model.services.BrazilTaxService;
import Iniciante.intefarce.rentcar.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:ss");

        try {
            System.out.println("Enter rental data");
            System.out.println("Car model:");
            String carModel = sc.nextLine();
            System.out.println("Pickup dd/MM/yyyy hh:ss");
            Date start = sdf.parse(sc.nextLine());
            System.out.println("Return dd/MM/yyyy hh:ss");
            Date finish = sdf.parse(sc.nextLine());

            CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

            System.out.println("Enter price per hour:");
            double pricePerHour= sc.nextDouble();
            System.out.println("Enter price per day:");
            double pricePerDay=sc.nextDouble();

            RentalService rentalService = new RentalService(pricePerDay,pricePerDay,new BrazilTaxService());

            rentalService.processInvoice(cr);

            System.out.println("INVOICE");
            System.out.println("BasicPayment "+String.format("%.2f",cr.getInvoice().getBasicPayment()));
            System.out.println("Tax "+String.format("%.2f",cr.getInvoice().getTax()));
            System.out.println("TotalPayment "+String.format("%.2f",cr.getInvoice().getTotalPayment()));
        }catch (Exception e){
            System.out.println("Has a "+e);
        }finally {
            if (sc!=null){
                sc.close();
            }
        }

    }
}
