package Iniciante.abstracte.application;

import Iniciante.abstracte.entities.Circle;
import Iniciante.abstracte.entities.Color;
import Iniciante.abstracte.entities.Rectangle;
import Iniciante.abstracte.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt","BR"));
        Scanner sc= new Scanner(System.in);
        List<Shape> shape= new ArrayList<>();
        System.out.println("Enter the number of shapes");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Rectangle or Cicle (r/c)? ");
             char type=sc.next().charAt(0);
            System.out.println("Color (Black/Blue/Red): ");
            sc.nextLine();
            Color color= Color.valueOf(sc.nextLine());
             switch (type){
                 case 'r':
                     System.out.println("Width: ");
                     double width=sc.nextDouble();
                     System.out.println("Height: ");
                     double height=sc.nextDouble();
                     shape.add(new Rectangle(color,width,height));
                     break;
                 case 'c':
                     System.out.println("Radius: ");
                     double radius=sc.nextDouble();
                     shape.add(new Circle(color,radius));
                     break;
             }

        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape s:shape){
            System.out.println(String.format("%.2f",s.Area()));
        }
        sc.close();
    }
}
