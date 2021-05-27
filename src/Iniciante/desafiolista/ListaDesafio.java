package Iniciante.desafiolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaDesafio {
    public static void main(String[] args){

        var id=0;
        var name=" ";
        var salary=0.0;
        int i=0;

        Locale.setDefault(Locale.FRENCH);
        List<Employees> employee= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n=sc.nextInt();

        while(n>employee.size()) {
            System.out.println("Employee #"+(i+1));

            System.out.println("Id :");
            id=sc.nextInt();
            while(hasId(employee,id)){
                System.out.println("Id ja registrado, digite outro");
                id=sc.nextInt();
            }
            System.out.println(" Name :");
            sc.nextLine();
            name=sc.nextLine();
            System.out.println(" Salary :");
            salary=sc.nextDouble();

            employee.add(new Employees(id,name,salary));
            i++;
        }

        System.out.println("Enter the employee id that will have salary increase:");
        var idSalaryIncrease=sc.nextInt();
        Employees emp=employee.stream().filter(x->x.getId()==idSalaryIncrease).findFirst().orElse(null);
        if(emp==null){
            System.out.println("This id does not exist");
        }else {
            System.out.println("Enter the percentage");
            var percentage = sc.nextDouble();
            emp.increase(percentage);
        }

        System.out.println("List of Employees");
        for( Employees listEmployee: employee){
            System.out.println(listEmployee);
        }
        sc.close();
    }

    public static boolean hasId(List<Employees> list,int id){
        Employees emp=list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        return emp!=null;
    }
}
