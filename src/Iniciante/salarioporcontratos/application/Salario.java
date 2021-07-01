package Iniciante.salarioporcontratos.application;

import Iniciante.salarioporcontratos.entities.Department;
import Iniciante.salarioporcontratos.entities.HourContract;
import Iniciante.salarioporcontratos.entities.Worker;
import Iniciante.salarioporcontratos.entities.enums.WorkerLevel;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.FRENCH);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("Enter department`s name: ");
        String departmentName =sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName =sc.nextLine();
        System.out.print("Level: ");
        String workerLevel =sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary  =sc.nextDouble();
        Worker worker= new Worker(
                workerName,
                WorkerLevel.valueOf(workerLevel),
                baseSalary,
                new Department(departmentName));

        System.out.println("How many contracts to this worker?: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.printf("Enter contract #%d data: %n", i);
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour=sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours=sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to caculate income (MM/YYYY): ");
        String monthAndYear=sc.next();
        int month=Integer.parseInt(monthAndYear.substring(0,2));
        int year=Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for"+monthAndYear+":"+String.format("%.2f",worker.income(year,month)));


        sc.close();

    }
}



