package Iniciante.funcional.exercicio;

import Iniciante.funcional.exercicio.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list=new ArrayList<>();
        Product ps=null;
        Scanner sc= new Scanner(System.in);
        String path="C:\\temp\\produto_lambda.csv";

        //sc.nextLine();
        try(BufferedReader bs = new BufferedReader(new FileReader(path))){
            String line=bs.readLine();
            while(line!=null){
                String[] product=line.split(",");
                String name=product[0];
                Double price=Double.valueOf(product[1]);
                ps=new Product(name,price);
                list.add(ps);
                line=bs.readLine();
            }
        }catch(IOException e){
            System.out.println("Ocorreu o erro"+e.getMessage());
        }

        list.stream().forEach(l->l.getName());
        list.stream().forEach(System.out::println);
        Double avg=list.stream().map(p->p.getPrice()).reduce(0.0,((x,y)->x+y))/list.size();
        System.out.printf("\nA media da lista e R$%.2f \n%n",avg);

        Comparator<String> comparator= (s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase());
        List<String> names= list.stream()
                .filter(p->p.getPrice()<avg)
                .map(p-> p.getName())
                .sorted(comparator)
                .collect(Collectors.toList());
        names.forEach(System.out::println);

//        System.out.println(names);

//        Set<String> treeset = new TreeSet<String>(list.stream().map(p->p.getName()).collect(Collectors.toList()));

//        for (String p:treeset) {
//            System.out.println(p);
//        }

//      System.out.println(list.stream().map(p->p.getName()).collect(Collectors.toList()));
    }
}
