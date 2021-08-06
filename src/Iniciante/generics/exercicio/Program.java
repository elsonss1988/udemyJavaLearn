package Iniciante.generics.exercicio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

    int numberStudent=0;
    int n;
    Scanner sc= new Scanner(System.in);

    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    Set<Integer> c = new HashSet<>();

        for(int i=0;i<3;i++) {
            switch (i) {
                case 0:
                    System.out.print("How many students for course A?");
                    n = sc.nextInt();
                    for (int j = 0; j < n; j++) {
                        ;
                        numberStudent = sc.nextInt();
                        a.add(numberStudent);
                    }
                    break;
                case 1:
                    System.out.print("How many students for course B?");
                    n = sc.nextInt();
                    for (int j = 0; j < n; j++) {
                        ;
                        numberStudent = sc.nextInt();
                        b.add(numberStudent);
                    }
                    break;
                case 2:
                    System.out.print("How many students for course C?");
                    n = sc.nextInt();
                    for (int j = 0; j < n; j++) {
                        ;
                        numberStudent = sc.nextInt();
                        c.add(numberStudent);
                    }
                    break;
            }
        }
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println("Total Students: "+total.size());
        sc.close();
    }
}
