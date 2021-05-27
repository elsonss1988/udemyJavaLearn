package Iniciante.Pensionista;

import java.util.Scanner;

public class Alugar {
    public static void main(String[] main){
        Scanner sc= new Scanner(System.in);
        //int n=sc.nextInt();
        int n=10;
        Quartos[] vect = new Quartos[n];
        var op='y';
        while(op=='y'){
        //for( var i=0;i<n;i++) {
            System.out.println("Digite seu nome");
            var name=sc.nextLine();
            System.out.println("Digite seu email");
            var email=sc.nextLine();
            System.out.println("Digite seu Quarto");
            var numberQuarto = sc.nextInt();
            while(numberQuarto>9) {
                System.out.println("Digite um quanto disponivel entre 0 e 9");
            }
            vect[numberQuarto] = new Quartos(name, email, numberQuarto);
            System.out.println("Deseja alugar para outro usuario (y/n)?");
            op=sc.next().charAt(0);
            sc.nextLine();
        }
        for(var i=0;i<n;i++){
            System.out.println("Vector "+vect[i]);
        }

        sc.close();
    }
}
