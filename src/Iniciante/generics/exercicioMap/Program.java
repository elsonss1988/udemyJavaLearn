package Iniciante.generics.exercicioMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String,Integer> votos= new TreeMap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file full path:");

        String path=sc.nextLine();
        try(BufferedReader br= new BufferedReader(new FileReader(path))){
            String line=br.readLine();
            while(line!=null){
                String[] fields=line.split(",");

                String name=fields[0];
                Integer count=Integer.valueOf(fields[1]);

                if(votos.containsKey(name)){
                    int votosCount=votos.get(name);
                    votos.put(name,votosCount+count);
                }else{
                    votos.put(name,count);
                }
                System.out.println(line);
                line=br.readLine();
            }
            System.out.println("----------------------------------");

            for(String key:votos.keySet()){
                System.out.println(key+" : "+votos.get(key));
            }

        }catch(IOException e){
            System.out.println("Log de erro: "+e);
            e.printStackTrace();
        }
        System.out.println(path);
    }


}
