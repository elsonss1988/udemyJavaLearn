package Iniciante.banco;

import java.util.Scanner;

public class AppBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor=0;
        System.out.println("Enter account number ");
        var conta=sc.nextInt();
        System.out.println("Enter account holder ");
        sc.nextLine();
        var nameTemp=sc.nextLine();
        var name= nameTemp.substring(0,1).toUpperCase()+nameTemp.substring(1).toLowerCase();
        System.out.println("Is there an initial deposit (y/n)?");
        var op=sc.next().charAt(0);
        if(op=='y'){
            System.out.println("Enter initial deposit value");
            valor=sc.nextDouble();
        }
        System.out.println("\n\n");
        Banco banco= new Banco(conta,name,valor);
        System.out.println("Account data: ");
        System.out.println(banco+"\n\n");

        System.out.println("Enter a deposit value: ");
        double deposit=sc.nextDouble();
        banco.deposito(deposit);
        System.out.println("Updated account data: ");
        System.out.println(banco+"\n\n");

        System.out.println("Enter a withdraw value ");
        double withdraw=sc.nextDouble();
        banco.saque(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(banco+"\n\n");
    }
}
