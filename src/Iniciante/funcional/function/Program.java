package Iniciante.funcional.function;

import Iniciante.funcional.consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("TV",80.90));

        //1st Interface
        //list.forEach(new PriceUpdate());

        //2nd class static
        //list.forEach(Product::staticPriceUpdate);

        //3rd Class non static
        //list.forEach(Product::nonStaticProductPredicate);

        //lambda express
        //Consumer<Product> consumer = p->p.setPrice(p.getPrice()*1.1);
        //list.forEach(consumer);
        //list.forEach(System.out::println);

        //Lambada Inline
        list.forEach(p->p.setPrice(p.getPrice()));
        list.forEach(System.out::println);
    }
}
