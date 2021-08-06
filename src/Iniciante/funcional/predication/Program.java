package Iniciante.funcional.predication;

import Iniciante.funcional.predication.entities.Product;
import Iniciante.funcional.predication.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("TV",80.90));

        // Lambda Expression
        // list.removeIf(p->p.getPrice()>=100);

        // Funcional Interface
        // list.removeIf(new ProductPredicate());

        //Static Reference
        //list.removeIf(Product::staticProductPredicate);

        //Non Static
        //list.removeIf(Product::nonStaticProductPredicate);

        // Lambda Expression
        // Predicate<Product> pred=p -> p.getPrice()>100.0;

        // Lambda Inline
        // p.getPrice()>100.0;

        for (Product p:list){
            System.out.println(p.getPrice()>100.0);
        }
    }
}
