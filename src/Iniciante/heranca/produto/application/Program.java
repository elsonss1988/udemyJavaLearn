package Iniciante.heranca.produto.application;

import Iniciante.heranca.produto.entities.ImportedProduct;
import Iniciante.heranca.produto.entities.Product;
import Iniciante.heranca.produto.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(new Locale("pt","BR"));
        Scanner sc= new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int quantify= sc.nextInt();


        for(int i=1;i<=quantify;i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option= sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name= sc.nextLine();
            System.out.print("Price:");
            Double price=sc.nextDouble();

            if (option == 'i') {
                System.out.print("Customs fee:");
                Double fee= sc.nextDouble();
                list.add(new ImportedProduct(name,price,fee));
            }
            if (option == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date date= sdf.parse(sc.nextLine());
                list.add(new UsedProduct(name,price,date));
            }
            if (option == 'c') {
                list.add(new Product(name,price));
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod:list) {
            System.out.println(prod.priceTag());
        }

    }
}
