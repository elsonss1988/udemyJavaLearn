package Iniciante.Erros.vectorError.application;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        callSelect();
        System.out.println();
        System.out.println("End of Program");
    }
    public static void callSelect(){
        System.out.println("Begin First");
        selectName();
        System.out.println("End Last ");
    }

    public static void selectName() {
        System.out.println("Begin");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter with lot of names");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Enter with a number to name will be found");
            int position = sc.nextInt();
            System.out.print("The name is: ");
            System.out.print(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input Error");
        }
        sc.close();
        System.out.println("END");
    }
}
