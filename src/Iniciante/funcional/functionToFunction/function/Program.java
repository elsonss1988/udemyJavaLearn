package Iniciante.funcional.functionToFunction.function;

import Iniciante.funcional.functionToFunction.function.entities.Product;
import Iniciante.funcional.functionToFunction.function.util.ProductService;

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
        list.add(new Product("HD Case",80.90));

        ProductService ps=new ProductService();
        double sum=ps.filteredSum(list);
        System.out.println(ps.filteredSum(list));

    }
}
