package Iniciante.estoque;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estoque estoque=new Estoque();

        System.out.println("Digite o nome do produto ");
        var name=sc.nextLine();
        estoque.setName(name);
        System.out.println("Digite o preco");
        var price= sc.nextDouble();
        estoque.setPrice(price);
        System.out.println("Digite a quantidade ");
        var quantity=sc.nextInt();
        estoque.setQuantity(quantity);

        System.out.printf("Name "+estoque.getName()+"%n");
        System.out.printf("Price "+estoque.getPrice()+"%n");
        System.out.printf("Quantity "+estoque.getQuantity()+"%n");

        System.out.println(estoque);
        sc.close();

        //Estoque estoque= new Estoque(name,price,quantity);


        /*System.out.println("Digite a sua opcao");
        System.out.println("Adicionar (1)");
        System.out.println("Remover   (2)");
        System.out.println("Adicionar quantidade (3)");
        System.out.println("Remover quantidade (4)");
        System.out.println("Mostrar estoque (5)");

        var op= sc.nextInt();

        switch(op){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }*/
    }

}
