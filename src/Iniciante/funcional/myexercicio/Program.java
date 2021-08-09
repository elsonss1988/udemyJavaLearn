package Iniciante.funcional.myexercicio;

import Iniciante.funcional.myexercicio.entities.Employeer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Employeer emp=null;
        List<Employeer> list = new ArrayList<>();
        String path="C:\\temp\\lambda_exer.csv";

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);


        try(BufferedReader br=new BufferedReader(new FileReader(path))){
         String line=br.readLine();
         while(line!=null){
             String[] fields=line.split(",");

             String name=fields[0];
             String email=fields[1];
             Double salary=Double.valueOf(fields[2]);

             emp= new Employeer(name,email,salary);
             list.add(emp);

             line=br.readLine();
         }
        }catch(IOException e){
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.printf("Enter full file path: %s %n",path);
        System.out.print("Enter salary: ");
        Double inputSalary= Double.valueOf(sc.nextLine());
        System.out.printf("Email of people whose salary is more than %.2f \n",inputSalary);
        System.out.println();
        list.stream().filter(employ->employ.getSalary()>inputSalary).map(employ->employ.getEmail()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        System.out.print("Sum of salary of people whose name starts with 'M' ");
        System.out.printf("R$%.2f",list.stream().filter(employ->employ.getName().charAt(0)=='M').map(employ->employ.getSalary()).reduce(0.0,(x,y)->x+y));
        System.out.println();
    }
}
