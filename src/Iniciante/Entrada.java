package Iniciante;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome");
        var nome = sc.next();
        System.out.println("Digite sua idade");
        var idade =sc.nextInt();
        System.out.println("Digite a sua Altura");
        var altura=sc.nextDouble();
        System.out.println("Qual a sua Letra favorita");
        var letra=sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Digite uma frase que te impactou");
        var frase=sc.nextLine();


        System.out.printf("Bem vindo "+nome+" ");
        System.out.printf("voce tem "+idade+" anos. ");
        System.out.printf("%n Voce tem a altura de "+altura+" metros");
        System.out.printf("%n sua letra favorita e' %c e a primeira letra do seu nome e' %c",letra,nome.charAt(0));
        System.out.printf("%n%n");
        System.out.printf(" A frase que mais te impactou foi: %n"+frase+"%n%n%n");
        System.out.println("Vamos fazer um Calculo? (S/N)");
        var resposta=sc.next().charAt(0);

        if(resposta=='s' || resposta=='S'){
            System.out.println("Menu");
            System.out.println("Raiz Quadrada (1)");
            System.out.println("Potencia quadradica (2)");
            System.out.println("Valor absoluto (3)");
            var op=sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("Digite seu valor");
                    var valor1=sc.nextDouble();
                    var res1=Math.sqrt(valor1);
                    System.out.println("A raiz de "+valor1+" e' "+res1);
                    break;
                case 2:
                    System.out.println("Digite seu valor");
                    var valor2=sc.nextDouble();
                    var res2=Math.pow(valor2,2);
                    System.out.println("A potencia de "+valor2+" e' "+res2);
                    break;
                case 3:
                    System.out.println("Digite seu valor");
                    var valor3=sc.nextDouble();
                    var res3=Math.abs(valor3);
                    System.out.println("O valor absoluto de "+valor3+" e' "+res3);
                    break;

            }
        }

        sc.close();
    }
}
