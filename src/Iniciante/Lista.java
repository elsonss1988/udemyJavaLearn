package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args){
      List<String> list = new ArrayList<>();

      list.add("Maria");
      list.add("Alex");
      list.add("Bob");
      list.add("Anna");
      list.add("Pedro");
      list.add("Paulo");
      list.add(2,"Marco");
      list.remove("Bob");

      for(String nome:list){
          System.out.println(nome);
      }
      System.out.println("---------------");
      list.removeIf(x->x.charAt(0) == 'P');
      for(String nome:list){
          System.out.println(nome);
      }
      System.out.println("---------------");
      List<String> result = list.stream().filter(x->x.charAt(0)=='M').collect(Collectors.toList());
      for(String nome:result){
          System.out.println(nome);
      }
      System.out.println("----------------------");
      String name= list.stream().filter(x->x.charAt(0)=='M').findFirst().orElse(null);
      System.out.println("Meu nome e : "+name);
    }
}
