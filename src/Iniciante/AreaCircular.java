package Iniciante;

import java.util.Scanner;

public class AreaCircular {

       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o Raio da Area");
            Double raio=sc.nextDouble();
            Double area;
            area = 3.14159 * (Math.pow( raio,2));
            System.out.printf("A=%.4f\n", area);
        }
    }
