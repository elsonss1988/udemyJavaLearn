package Iniciante.intefarce.brazilInterestService;

import Iniciante.intefarce.brazilInterestService.services.BrazilInterestService;
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        final double INTEREST=2.0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount=sc.nextDouble();
        System.out.println("Months: ");
        int months=sc.nextInt();

        BrazilInterestService is=new BrazilInterestService(INTEREST);
        double payment = is.payment(amount,months);

        System.out.println("Payment after"+months+"months:");
        System.out.println(String.format("%.2f",payment));
        sc.close();

    }
}
