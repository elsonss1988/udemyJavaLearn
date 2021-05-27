package Iniciante;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args){
        var op = 9;
        var total=0f;

        Scanner sc= new Scanner(System.in);

        System.out.println("Codigo Especificacao Preco");
        System.out.println(" 1 Cachorro Quente  R$4.00");
        System.out.println(" 2 X-salada         R$4.50");
        System.out.println(" 3 X-Bacon          R$4.00");
        System.out.println(" 4 Torrada Simples  R$2.00");
        System.out.println(" 5 Refrigerante     R$1.50");
        System.out.printf(" 0 Use para Sair %n%n");

        while (op!=0){
            System.out.printf("%nDigite o seus Pedidos %n");
            op=sc.nextInt();


            switch(op){
                case 1:
                    total+=4.00;
                    break;
                case 2:
                    total+=4.50;
                    break;
                case 3:
                    total+=4.00;
                    break;
                case 4:
                    total+=2.00;
                    break;
                case 5:
                    total+=1.50;
                    break;
            }
            if(op!=0) {
                System.out.printf("Valor Parcial R$ %.2f", total);
            }
        }
        System.out.printf("O total da sua conta R$ %.2f",total);
    }
}
