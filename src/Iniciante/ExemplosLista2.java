package Iniciante;

import java.util.ArrayList;
import java.util.List;

public class ExemplosLista2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");

        for(var i=0;i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }
    }
}
