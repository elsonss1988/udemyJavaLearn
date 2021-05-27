package Iniciante;

import java.util.ArrayList;
import java.util.List;

public class ExemplosLista3 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");

        for(String nome:nomes){
            System.out.println("Nomes "+nome);
        }
    }
}
