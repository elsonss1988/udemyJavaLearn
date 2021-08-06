package Iniciante.intefarce.exercicio;

import Iniciante.intefarce.exercicio.entities.Contract;
import Iniciante.intefarce.exercicio.entities.Installment;
import Iniciante.intefarce.exercicio.services.ContractService;
import Iniciante.intefarce.exercicio.services.OnlinePaymentService;
import Iniciante.intefarce.exercicio.services.PaypalService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        //Locale.setDefault(new Locale("pt","BR"));
        Locale.setDefault(Locale.FRENCH);
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Contract data");
        System.out.print("Number ");
        int contractNumber= sc.nextInt();
        System.out.print("Date(dd/MM/yyyy) ");
        sc.nextLine();
        Date contractDate=sdf.parse(sc.nextLine());
        System.out.print("Contract Value ");
        double contractValue=sc.nextDouble();

        Contract contract=new Contract(contractNumber,contractDate,contractValue);

        System.out.print("Enter number of installments: ");
        int installNumber=sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract,installNumber);

        System.out.println("Installments: ");

        for(Installment it: contract.getInstallments()){
            System.out.println(it);
        }

        sc.close();
    }
}
