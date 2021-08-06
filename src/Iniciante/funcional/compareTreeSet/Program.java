package Iniciante.funcional.compareTreeSet;

import Iniciante.funcional.compareTreeSet.entities.Product;
import Iniciante.funcional.compareTreeSet.services.MyComparator;

import java.util.*;

public class Program {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV",900.0));
        list.add(new Product("Notebook",1200.0));
        list.add(new Product("Tablet",400.0));

        // 1nd Form
//        Collections.sort(list);
//        list.sort(new MyComparator());

        // 2nd Form

//        Comparator<Product> comp = new Comparator<Product>(){
//
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };


        //3 Form
//        Comparator<Product> comp = (p1,p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

        //4 Form

        Comparator<Product> comp = (p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);

        //5 Form


        list.sort((p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p:list){
            System.out.println(p);
        }

    }
}
