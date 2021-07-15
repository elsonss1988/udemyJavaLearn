package Iniciante.file.exercicios;

import Iniciante.file.exercicios.entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        String path="C:\\temp\\summary.csv";
        File file = new File(path);
        List<Product> products=new ArrayList<>();
        try(BufferedReader br= new BufferedReader(new FileReader(file))){
            String line=br.readLine();
            while(line!=null){
                String[] data=line.split(",");
                Product product= new Product(data[0],Double.valueOf(data[1]),Integer.parseInt(data[2]));
                products.add(product);
                line=br.readLine();
            }
            for(Product prodImprimir:products){
                System.out.println(prodImprimir.toString());
            }

        }catch (IOException e){
            e.printStackTrace();
        };

    }
}
