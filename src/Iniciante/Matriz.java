package Iniciante;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de linha da sua matriz");
        var linhas=sc.nextInt();
        System.out.println("Digite o valor de coluna da sua matriz");
        var colunas=sc.nextInt();

        Integer[][] matriz = new Integer[linhas][colunas];
        for(var i=0;i<linhas;i++){
            for ( var j=0;j<colunas; j++){
                //System.out.print("Matriz"+i+","+j);
                matriz[i][j]=sc.nextInt();
            }
            System.out.printf("%n");
        }

        System.out.println("Digite um numero da Matriz");
         var pesquisar=sc.nextInt();
        for(var i=0;i<linhas;i++){
            for ( var j=0;j<colunas; j++){
                if(pesquisar==matriz[i][j]){
                    System.out.printf("Position "+i+","+j+"%n");
                    if(j>0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if(i>0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if(j<matriz[i].length-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if(i<matriz.length-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
            System.out.printf("\n");
        }


    }
}
