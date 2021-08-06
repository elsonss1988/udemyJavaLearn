package Iniciante.funcional.consumer;

import Iniciante.funcional.function.entities.Product;
import Iniciante.funcional.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("TV",80.90));

        // 1st Interface
        //List<String> names=list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // 2nd Static
        //List<String> names=list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // 3rd non static
        //List<String> names=list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // 4th lambda declarative
        //Function<Product,String> function= p->p.toString().toUpperCase();
        //List<String> names=list.stream().map(function).collect(Collectors.toList());

        // 5yh lambda inline
        List<String> names=list.stream().map(p->p.toString().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
