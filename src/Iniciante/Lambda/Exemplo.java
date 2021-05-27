package Iniciante.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {
    public static void main(String[] args){
        List<Cliente> clientes=  new ArrayList<>();
        clientes.add(new Cliente(1L,"Jose"));
        clientes.add(new Cliente(2L,"Rose"));
        clientes.add(new Cliente(3L,"Joao"));

        for(Cliente cliente:clientes){
            if(cliente.getNome().startsWith("J")){
              System.out.println(cliente.getNome());
            };
        }
        clientes.forEach(cliente->System.out.printf("Cliente %s com ID %d%n",cliente.getNome(),cliente.getId()));


    }
}
