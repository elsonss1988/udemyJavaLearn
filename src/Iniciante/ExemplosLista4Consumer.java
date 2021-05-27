package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExemplosLista4Consumer {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");

        nomes.forEach(nome->System.out.println(nome));
        System.out.println("-----------");
        nomes.forEach(System.out::println);

    }
}
